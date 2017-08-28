package com.everis.alicante.courses.beca.summer17.friendsnet.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Post implements FNEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Date creationDate;
    private PostType type;
    private byte[] picture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private Event event;
}
