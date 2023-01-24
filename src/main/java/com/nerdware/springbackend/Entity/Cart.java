package com.nerdware.springbackend.Entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Data//inmemory
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @SequenceGenerator(
            name = "cart_sequence",
            sequenceName = "cart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "cart_sequence"
    )
    private Long id;

//    private List<Product> products = new ArrayList<>();

    private Integer price;
}
