package com.acrecer.assement.dto.request;


import com.acrecer.assement.model.Person;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
public class DirectionRequest {

    @NotBlank(message = "Direction is required")
    private String direction;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    private Person id_person;

    public DirectionRequest() {
    }

    public DirectionRequest(String direction, Date date, Person id_person) {
        super();
        this.direction = direction;
        this.date = date;
        this.id_person = id_person;
    }
}
