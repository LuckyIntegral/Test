package ua.com.alevel.service.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.test.context.junit4.SpringRunner;

import ua.com.alevel.entity.Profile;
import ua.com.alevel.entity.User;
import ua.com.alevel.exception.EntityNotFoundException;
import ua.com.alevel.exception.UnsupportableEntityException;
import ua.com.alevel.repository.UserRepository;
import ua.com.alevel.service.impl.UserServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class UserServiceMockTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private UserRepository userRepository;

    private static final String firstName = "firstName";
    private static final String lastname = "lastName";
    private static final String email = "email@gmial.com";

    public final User user = new User();
    private final Profile profile = new Profile();

    @Before
    public void setUp() {
        user.setFirstName(firstName);
        user.setLastName(lastname);
        user.setEmail(email);
        profile.setUser(user);
    }

    @Test
    public void shouldBeCreateUserWhenEmailIsUnique() {
        //given
        Executable executable = () -> userService.create(user);
        when(userRepository.existsByEmail(email)).thenReturn(true);

        //when
        Exception exception = assertThrows(UnsupportableEntityException.class, executable);

        //then
        assertThat(exception).isInstanceOf(UnsupportableEntityException.class);
        assertThat(exception.getMessage()).isEqualTo("User already exists");
    }

    @Test
    public void shouldBeUpdatedUserWhenEmailIdExist() {
        when(userRepository.existsById(1L)).thenReturn(true);

        userService.update(1L, user);

        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void shouldBeUpdateUserWhenIdIsNotExist() {
        //given
        Executable executable = () -> userService.update(100L, user);
        when(userRepository.existsById(100L)).thenReturn(false);

        //when
        Exception exception = assertThrows(EntityNotFoundException.class, executable);

        //then
        assertThat(exception).isInstanceOf(EntityNotFoundException.class);
        assertThat(exception.getMessage()).isEqualTo("Entity not found");
    }
}
