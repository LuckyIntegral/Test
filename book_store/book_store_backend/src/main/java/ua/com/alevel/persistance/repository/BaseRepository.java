package ua.com.alevel.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ua.com.alevel.persistance.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<ENTITY extends BaseEntity> extends JpaRepository< ENTITY, Long> {

}
