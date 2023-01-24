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
}
