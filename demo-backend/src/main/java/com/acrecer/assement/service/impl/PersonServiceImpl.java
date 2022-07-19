package com.acrecer.assement.service.impl;

import com.acrecer.assement.dto.request.PersonRequest;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.repository.PersonRepository;
import com.acrecer.assement.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepo;

    @Override
    public List<Person> ListPerson() {
        return this.personRepo.findAll();
    }

    @Override
    public Person savePerson(Person personNew) {
        return this.personRepo.save(personNew);
    }
}
