package ua.com.alevel.repository;

import org.springframework.stereotype.Repository;
import ua.com.alevel.entity.Profile;
import ua.com.alevel.entity.User;

@Repository
public interface ProfileRepository extends BaseRepository<Profile> {
    Profile findByUser(User user);
}
