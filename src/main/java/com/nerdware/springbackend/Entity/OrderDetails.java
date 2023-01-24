package com.nerdware.springbackend.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
@Data
public class OrderDetails {

    @Id
    private Long id;

    private Integer quantity;
    private String paymentType;
    private Integer phoneNumber;
    private double price;

}
