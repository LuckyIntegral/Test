package ua.com.alevel.service.unit;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ua.com.alevel.entity.User;
import ua.com.alevel.exception.UnsupportableEntityException;
import ua.com.alevel.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceUnitTest {
    private static final String firstName = "firstName";
    private static final String lastname = "lastName";
    private static final String email = "email@gmial.com";

    private static User user = new User();

    @Autowired
    private UserService userService;

    @BeforeAll
    public static void setUp() {
        user.setFirstName(firstName);
        user.setLastName(lastname);
        user.setEmail(email);
    }

    @Test
    @Order(1)
    public void shouldBeCreateUserWhenEmailIsUnique() {
        //given
        userService.create(user);

        //when
        user = userService.findById(1L);

        //then
        assertThat(user.getId()).isEqualTo(1L);
        assertThat(user.getFirstName()).isEqualTo(firstName);
        assertThat(user.getLastName()).isEqualTo(lastname);
        assertThat(user.getEmail()).isEqualTo(email);

    }

    @Test
    @Order(2)
    public void shouldBeCreateUserWhenEmailIsNotUnique() {
        //given
        Executable executable = () -> userService.create(user);

        //when
        Exception exception = assertThrows(UnsupportableEntityException.class, executable);

        //then
        assertThat(exception).isInstanceOf(UnsupportableEntityException.class);
        assertThat(exception.getMessage()).isEqualTo("User already exists");
    }
}
