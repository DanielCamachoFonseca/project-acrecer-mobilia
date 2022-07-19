package com.acrecer.assement.controller;

import com.acrecer.assement.model.Direction;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.service.DirectionService;
import com.acrecer.assement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/directions")
public class DirectionController {

    @Autowired
    private DirectionService directionService;

    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public ResponseEntity<List<Direction>> listDirection() {
        return new ResponseEntity<>(directionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> listPerson() {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search/{name}/{surname}/{email}")
    public ResponseEntity<List<Direction>> searchPerson(@PathVariable String name, @PathVariable String surname, @PathVariable String email) {
        return new ResponseEntity<>(directionService.searchPerson(name, surname, email), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Direction> createDirection(@RequestBody Direction direction){
        return new ResponseEntity<>(directionService.save(direction), HttpStatus.CREATED);
    }
}
