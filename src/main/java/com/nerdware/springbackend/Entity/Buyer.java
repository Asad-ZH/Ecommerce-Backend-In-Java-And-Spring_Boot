package com.nerdware.springbackend.Entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "buyer")
public class Buyer {

    @Id
    @SequenceGenerator(
            name = "buyer_sequence",
            sequenceName = "buyer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "buyer_sequence"
    )
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer phone;

    public Buyer() {
    }

    public Buyer(String firstName, String lastName, String email, String password, Integer phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }


}
