package com.acrecer.assement.dto;

import com.acrecer.assement.model.Person;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("EntityToDto")
public class EntityToDto {

    @Autowired
    private ModelMapper modelMapper;

    public Person convertToDtoPerson(Person person) {
        Person personDTO = null;
        if(person != null) {
            personDTO = modelMapper.map(person, Person.class);
        }
        return personDTO;
    }
}
