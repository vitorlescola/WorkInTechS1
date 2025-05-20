package br.com.workintech.demo_api1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorTemperaturaController {
    @GetMapping("/C")
    public int conversorC(){
        ConversorTemperatura ct=new ConversorTemperatura();
        return ct.converterParaC(75);
    }
    @GetMapping("/F")
    public int conversorF(){
        ConversorTemperatura ct=new ConversorTemperatura();
        return ct.converterParaF(20);
    }
    }
