package com.acrecer.assement.service;

import com.acrecer.assement.dto.request.DirectionRequest;
import com.acrecer.assement.model.Direction;

import java.util.List;

public interface DirectionService {

    List<Direction> ListDirection();
    Direction saveDirection(Direction directionNew);
}
