package ua.com.level.persistance.dao;

import ua.com.level.persistance.entity.BaseEntity;

import java.util.Collection;

public interface BaseDao<ENTITY extends BaseEntity> {
    void create(ENTITY entity);
    void update(ENTITY entity);
    void delete(Long id);
    ENTITY findById(Long id);
    Collection<ENTITY> findAll();
}
