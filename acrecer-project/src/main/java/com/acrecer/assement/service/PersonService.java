package com.acrecer.assement.service;

import com.acrecer.assement.model.Person;

import java.util.List;

public interface PersonService {

    public Person save(Person person);

    public List<Person> findAll();

    public List<Person> searchPerson(String name, String surname, String email);
}
