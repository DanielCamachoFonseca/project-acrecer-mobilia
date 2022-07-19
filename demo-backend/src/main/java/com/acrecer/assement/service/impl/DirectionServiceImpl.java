package com.acrecer.assement.service.impl;

import com.acrecer.assement.dto.request.DirectionRequest;
import com.acrecer.assement.model.Direction;
import com.acrecer.assement.repository.DirectionRepository;
import com.acrecer.assement.service.DirectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class DirectionServiceImpl implements DirectionService {

    private final DirectionRepository directionRepo;

    @Override
    public List<Direction> ListDirection() {
        return this.directionRepo.findAll();
    }

    @Override
    public Direction saveDirection(Direction directionNew) {
        return this.directionRepo.save(directionNew);
    }
}
