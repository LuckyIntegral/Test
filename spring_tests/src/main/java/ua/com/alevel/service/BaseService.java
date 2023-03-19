package ua.com.alevel.service;

import ua.com.alevel.entity.BaseEntity;

import java.util.Collection;

public interface BaseService<ENTITY extends BaseEntity> {
    void create(ENTITY entity);
    void update(Long id, ENTITY entity);
    void delete(Long id);
    ENTITY findById(Long id);
    Collection<ENTITY> findAll();
}
