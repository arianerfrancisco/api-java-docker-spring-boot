package com.organizacao.carros;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping") //http://localhost:8080/ping
public class PingController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void ping(){
        System.out.println("Tudo funcionando");
    }
}
