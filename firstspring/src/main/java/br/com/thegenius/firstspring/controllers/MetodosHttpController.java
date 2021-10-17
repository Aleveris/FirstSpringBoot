package br.com.thegenius.firstspring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "Requisição GET - está na Classe MetodosHttpCOntroller - " +
                "Alterando o os metodos com opor exemplo - Get, Post etc..." +
                "eles levam ao caminho que escolhi com o @ MetodoMapping ";
    }

    @PostMapping
    public String post(){
        return "Dados enviados com sucesso para o Banco de dados - com a Requisição POST ";
    }

    @PutMapping
    public String put(){
        return "Requisição PUT";
    }

    @PatchMapping
    public String patch(){
        return "Requisição patch";
    }

    @DeleteMapping
    public String delete(){
        return "Requisição DELETE";
    }
}
