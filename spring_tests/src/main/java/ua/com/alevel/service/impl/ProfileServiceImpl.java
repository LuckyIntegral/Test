package ua.com.alevel.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.alevel.entity.Profile;
import ua.com.alevel.entity.User;
import ua.com.alevel.exception.EntityNotFoundException;
import ua.com.alevel.repository.ProfileRepository;
import ua.com.alevel.service.ProfileService;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    @Transactional
    public void create(Profile entity) {
        profileRepository.save(entity);
    }

    @Override
    @Transactional
    public void update(Long id, Profile entity) {
        checkExistsById(id);
        entity.setId(id);
        profileRepository.save(entity);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        checkExistsById(id);
        profileRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Profile findById(Long id) {
        return profileRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    @Transactional
    public Profile findByUser(User user) {
        return profileRepository.findByUser(user);
    }

    private void checkExistsById(Long id) {
        if (profileRepository.existsById(id)) {
            throw new EntityNotFoundException("Entity not found");
        }
    }
}

