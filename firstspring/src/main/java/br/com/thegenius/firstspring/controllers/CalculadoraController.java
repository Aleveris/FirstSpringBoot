package br.com.thegenius.firstspring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidofinal")
public class CalculadoraController {

    //será usada para realizar o cálculo do pedido do cliente

    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @RequestMapping("/calcular")
    public int calcular(
            @RequestParam(name = "quantidade") int quantidade,
            @RequestParam(name = "precoitem") int precoitem) {
        return quantidade * precoitem;

    }
}
