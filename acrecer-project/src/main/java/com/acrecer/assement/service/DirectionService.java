package com.acrecer.assement.service;

import com.acrecer.assement.model.Direction;

import java.util.List;

public interface DirectionService {

    public Direction save(Direction direction);

    public List<Direction> findAll();

    public List<Direction> searchPerson(String name, String surname, String email);
}
