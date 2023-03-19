package com.google.service;

import com.google.persistence.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity> {
    void create(E entity);
    void upgrade(E entity);
    void delete(Long id);
    E findById(Long id);
    List<E> findAll();
}
