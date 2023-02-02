package com.example.aulaid.services;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
    public double fee (String state){
        if (state.equalsIgnoreCase("SP")){
            return 10;
        }else return 20;
    }
}
