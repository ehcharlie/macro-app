package com.example.macro.service;

public abstract class GenericService<T, ID> {

    protected GenericService() {
    }

    public abstract T save(T entity);

    public abstract void delete(ID id);

    public T update(String email, T entity) {
        return entity;
    }

    public abstract T update(T entity);

    public abstract T findById(ID id);
}