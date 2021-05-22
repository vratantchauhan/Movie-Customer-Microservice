package com.vratant.moviebookingapi.entity;

import javax.persistence.*;

@Entity
@Table(name="booking")
public class booking {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name="movie_id")
    private int movieID;
}
