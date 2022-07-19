package com.acrecer.assement.controller;

import com.acrecer.assement.dto.request.DirectionRequest;
import com.acrecer.assement.model.Direction;
import com.acrecer.assement.service.DirectionService;
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
@RequestMapping("/directions")
public class ControllerDirection {

    private final ModelMapper modelMapper;
    private final DirectionService directionService;

    @GetMapping("/list-direction")
    public List<Direction> getAllDirection(){
        return this.directionService.ListDirection();
    }

    @PostMapping("/register-direction")
    public Direction CreateDirection(@Valid @RequestBody Direction direction) {
        return this.directionService.saveDirection(direction);
    }
}
