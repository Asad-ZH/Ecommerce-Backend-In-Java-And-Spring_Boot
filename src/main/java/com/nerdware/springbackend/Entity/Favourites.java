package com.nerdware.springbackend.Entity;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(appliesTo = "favourites")
public class Favourites {

    @Id
    @SequenceGenerator(
            name = "favourites_sequence",
            sequenceName = "favourites_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "favourites_sequence"
    )
    private Long id;

//    private List<Product> products = new ArrayList<>();
}
