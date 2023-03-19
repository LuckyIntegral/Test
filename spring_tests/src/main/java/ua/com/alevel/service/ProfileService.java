package ua.com.alevel.service;

import ua.com.alevel.entity.Profile;
import ua.com.alevel.entity.User;

public interface ProfileService extends BaseService<Profile> {
    Profile findByUser(User user);
}
