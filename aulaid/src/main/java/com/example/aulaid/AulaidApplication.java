package com.example.aulaid;

import com.example.aulaid.services.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaidApplication implements CommandLineRunner {

    @Autowired
    private PayService payService;

    public static void main(String[] args) {
        SpringApplication.run(AulaidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(payService.finalPrice(300, "Sc"));
    }
}
