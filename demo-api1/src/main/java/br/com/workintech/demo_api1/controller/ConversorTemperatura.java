package br.com.workintech.demo_api1.controller;

public class ConversorTemperatura {
    public int converterParaF(int C){
        int F=(C*9/5)+32;
        return F;
    }
    public int converterParaC(int F){
        int C=(F-32)*5/9;
        return C;
    }
}
