package com.acrecer.assement.service;

import com.acrecer.assement.dto.request.PersonRequest;
import com.acrecer.assement.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> ListPerson();
    Person savePerson(Person personNew);
}
