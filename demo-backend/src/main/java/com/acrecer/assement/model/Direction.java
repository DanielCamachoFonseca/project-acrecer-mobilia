package com.acrecer.assement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.sql.Date;



@Entity
@Table(name = "direction")
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direction")
    private Long id_direction;

    @Column(name = "direction")
    private String direction;

    @Column(name = "date")
    private Date date;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_person")
    private Person id_person;

    public Direction() {
    }

    public Direction(Long id_direction, String direction, Date date, Person id_person) {
        super();
        this.id_direction = id_direction;
        this.direction = direction;
        this.date = date;
        this.id_person = id_person;
    }

    public Long getId_direction() {
        return id_direction;
    }

    public void setId_direction(Long id_direction) {
        this.id_direction = id_direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getId_person() {
        return id_person;
    }

    public void setId_person(Person id_person) {
        this.id_person = id_person;
    }
}
