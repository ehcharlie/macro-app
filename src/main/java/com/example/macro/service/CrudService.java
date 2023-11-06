package com.example.macro.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface CrudService<T, ID extends Serializable> extends MongoRepository<T, ID> {
}
