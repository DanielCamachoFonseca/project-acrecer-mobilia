package com.acrecer.assement.dto.request;

import javax.validation.constraints.NotBlank;

import com.acrecer.assement.model.Direction;
import com.acrecer.assement.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Surname is required")
    private String surname;

    @NotBlank(message = "Email is required")
    private String Email;
}
