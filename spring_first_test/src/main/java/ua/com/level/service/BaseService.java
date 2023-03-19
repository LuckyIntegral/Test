package ua.com.level.service;

import java.util.Collection;

public interface BaseService<ENTITY> {
    void create(ENTITY entity);
    void update(ENTITY entity);
    void delete(Long id);
    ENTITY findById(Long id);
    Collection<ENTITY> findAll();
}
