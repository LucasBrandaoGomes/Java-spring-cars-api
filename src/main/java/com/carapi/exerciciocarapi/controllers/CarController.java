package com.carapi.exerciciocarapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.exerciciocarapi.dto.CarDTO;

@RestController
@RequestMapping("/newcar")
public class CarController {
    
    @PostMapping
    public void create(@RequestBody CarDTO req){
        System.out.println(req.modelo());
        System.out.println(req.valor());
    }
}
