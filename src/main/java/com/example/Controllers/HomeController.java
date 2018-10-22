package com.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{

    protected int number;
    private String hello;
    private double currency;



    @RequestMapping(value="/home")
    public String index(){

        return "index";
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
