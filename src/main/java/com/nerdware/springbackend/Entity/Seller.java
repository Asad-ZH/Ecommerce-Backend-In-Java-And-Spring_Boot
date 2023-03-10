package com.nerdware.springbackend.Entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "seller")
@Data
public class Seller {

    @Id
    @SequenceGenerator(
            name = "seller_sequence",
            sequenceName = "seller_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "seller_sequence"
    )
    private Long id;

    @OneToMany(
            mappedBy = "seller",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            orphanRemoval = true
    )
    private List<Product> products = new ArrayList<>();

    private String name;
    private String storeName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String city;
    private String province;
    private String country;
    private String zipCode;



}
