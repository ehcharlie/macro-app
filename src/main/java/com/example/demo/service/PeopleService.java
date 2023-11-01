package com.example.demo.service;

import com.example.demo.dao.PeopleDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    PeopleDao peopleDao;

    public Person getPeople() {
        return peopleDao.getPeople();
    }
}
