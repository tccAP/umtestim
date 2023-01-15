package com.example.umtestim.demo.controller;

import com.example.umtestim.demo.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {

    @Autowired
    private TesteService service;

    @GetMapping("/teste")
    public String teste(){
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println("djkasdkasodkasod");
        System.out.println(service.teste());


        if(1==2){

            System.out.println("djkasdkasodkasod");
        }
        return "testezzzz";
    }

}
