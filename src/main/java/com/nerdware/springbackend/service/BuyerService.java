package com.nerdware.springbackend.service;


import com.nerdware.springbackend.Entity.Buyer;
import com.nerdware.springbackend.dao.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    private final BuyerRepository buyerRepository;

    @Autowired

    public BuyerService(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer getBuyerById(Long id) {
        return buyerRepository.findById(id).orElseThrow(() -> new IllegalStateException("Buyer with id " + id + " does not exist"));
    }
}
