package com.acrecer.assement.controller;

import com.acrecer.assement.dto.request.PersonRequest;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class ControllerPerson {

    private final ModelMapper modelMapper;
    private final PersonService personService;

    @GetMapping("/list-person")
    public List<Person> getAllPerson(){
        return this.personService.ListPerson();
    }

    @PostMapping("/register-person")
    public ResponseEntity<PersonRequest> CreatePerson(@Valid @RequestBody PersonRequest personRequest) {
        Person _personRequest = modelMapper.map(personRequest, Person.class);
        Person person = personService.savePerson(_personRequest);
        PersonRequest personResponse = modelMapper.map(person, PersonRequest.class);
        return new ResponseEntity<PersonRequest>(personResponse, HttpStatus.CREATED);
    }
}
