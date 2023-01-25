package com.nerdware.springbackend.controller;


import com.nerdware.springbackend.Entity.Buyer;
import com.nerdware.springbackend.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/buyer")
public class BuyerController {

    private final BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }
    @GetMapping("/{id}")
    public Buyer getBuyerById(@RequestParam Long id) {
        return buyerService.getBuyerById(id);
    }




}
