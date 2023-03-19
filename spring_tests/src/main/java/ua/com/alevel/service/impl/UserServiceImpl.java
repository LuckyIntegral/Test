package ua.com.alevel.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.alevel.entity.Profile;
import ua.com.alevel.entity.User;
import ua.com.alevel.exception.EntityNotFoundException;
import ua.com.alevel.exception.UnsupportableEntityException;
import ua.com.alevel.repository.UserRepository;
import ua.com.alevel.service.ProfileService;
import ua.com.alevel.service.UserService;

import java.util.Collection;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ProfileService profileService;

    @Override
    @Transactional
    public void create(User entity) {
        if (userRepository.existsByEmail(entity.getEmail())) {
            throw new UnsupportableEntityException("User already exists");
        }
        userRepository.save(entity);
        Profile profile = new Profile();
        profile.setUser(entity);
        profileService.create(profile);
    }

    @Override
    @Transactional
    public void update(Long id, User entity) {
        checkExistsById(id);
        entity.setId(id);
        userRepository.save(entity);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        User user = find(id);
        Profile profile = profileService.findByUser(user);
        profileService.delete(profile.getId());
        userRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return find(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    private void checkExistsById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new EntityNotFoundException("Entity not found");
        }
    }

    private User find(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
    }
}
