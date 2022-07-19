package com.acrecer.assement.controller;

import com.acrecer.assement.dto.PersonDto;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public ResponseEntity<List<Person>> listPerson() {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search/{name}/{surname}/{email}")
    public ResponseEntity<List<Person>> searchPerson(@PathVariable String name, @PathVariable String surname, @PathVariable String email) {
        return new ResponseEntity<>(personService.searchPerson(name, surname, email), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<>(personService.save(person), HttpStatus.CREATED);

    }



}
