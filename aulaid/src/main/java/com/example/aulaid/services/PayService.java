package com.example.aulaid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    @Autowired
    private TaxService taxService ;
    @Autowired
    private DeliverService deliverService;



    public double finalPrice (double cost, String state){

        return cost + taxService.tax(cost) + deliverService.fee(state);
    }
}
