package br.com.thegenius.firstspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //@RequestMapping(method = RequestMethod.GET, path = "/first")
    @GetMapping(path = "/caminho") // ou vários caminhos com o ({ "/caminho" , "/caminho2" })
    public String ola(){
        return "MEU PRIMEIRO CONTROLLER - SPRING BOOT ";
    }
}
