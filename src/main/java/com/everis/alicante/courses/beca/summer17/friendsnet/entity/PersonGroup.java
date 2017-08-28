package com.everis.alicante.courses.beca.summer17.friendsnet.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class PersonGroup implements FNEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private byte[] picture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    @JsonIgnore
    private Person person;
}
