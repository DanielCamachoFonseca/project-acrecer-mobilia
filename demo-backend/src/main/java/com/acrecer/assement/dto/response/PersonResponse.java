package com.acrecer.assement.dto.response;

import com.acrecer.assement.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponse {

    private String name;
    private String surname;
    private String Email;
    private List<Person> Persons;
}
