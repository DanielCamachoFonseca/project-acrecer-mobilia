package com.acrecer.assement.service;

import com.acrecer.assement.dto.EntityToDto;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private EntityToDto entityToDto;

    @Override
    public Person save(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }

    @Override
    public List<Person> searchPerson(String name, String surname, String email) {
        List<Person> persons = personRepo.findAll();
        if(!name.equals("null")) {
            persons = persons.stream().filter(l->l.getName().equals(name)).collect(Collectors.toList());
        }
        if(!surname.equals("null")) {
            persons = persons.stream().filter(l->l.getSurname().equals(surname)).collect(Collectors.toList());
        }
        if(!email.equals("null")) {
            persons = persons.stream().filter(l->l.getEmail().equals(email)).collect(Collectors.toList());
        }
        List<Person> list = new ArrayList<>();
        for (Person param : persons) {
            Person person = entityToDto.convertToDtoPerson(param);
            list.add(person);
        }
        return list;
    }
}
