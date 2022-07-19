package com.acrecer.assement.service;

import com.acrecer.assement.model.Direction;
import com.acrecer.assement.model.Person;
import com.acrecer.assement.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DirectionServiceImpl implements DirectionService {

    @Autowired
    private DirectionRepository directionRepo;

    @Override
    public Direction save(Direction direction) {
        return directionRepo.save(direction);
    }

    @Override
    public List<Direction> findAll() {
        return directionRepo.findAll();
    }

    @Override
    public List<Direction> searchPerson(String name, String surname, String email) {
        List<Direction> list = null;
        List<Direction> directions = directionRepo.findAll();
        if(!name.equals("null")) {
            directions = directions.stream().filter(l->l.getId_person().getName().equals(name)).collect(Collectors.toList());
        }
        if(!surname.equals("null")) {
            directions = directions.stream().filter(l->l.getId_person().getSurname().equals(surname)).collect(Collectors.toList());
        }
        if(!email.equals("null")) {
            directions = directions.stream().filter(l->l.getId_person().getEmail().equals(email)).collect(Collectors.toList());
        }
        list = new ArrayList<>(directions);
        return list;
    }


}
