package com.google.persistence.dao;

import com.google.persistence.entity.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseDao<E extends BaseEntity> {
    void create(E entity);
    void upgrade(E entity);
    void delete(Long id);
    Optional<E> findById(Long id);
    List<E> findAll();
}
