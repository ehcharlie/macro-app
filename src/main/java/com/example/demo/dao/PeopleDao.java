package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PeopleDao {

    public Person getPeople() {
        return new Person(
                "1",
                "Parameter, Ryan",
                "29",
                "January 1");
    }
}
