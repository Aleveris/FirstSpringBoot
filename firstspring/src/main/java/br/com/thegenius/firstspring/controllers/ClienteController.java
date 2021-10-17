package br.com.thegenius.firstspring.controllers;

import br.com.thegenius.firstspring.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping (path = "/hambugueria")
    public Cliente obterCliente(){
        return new Cliente(28,"Alexandre","291.007.142-90");

    }

    @GetMapping("/{id}")
    public Cliente ObterClientePorId(@PathVariable int id) {
        return new Cliente(id,"Grazi","291.998.009-90");
    }

    @GetMapping
    public Cliente obterClientePorId2(
            @RequestParam(name = "id") int id) {
        return new Cliente(id,"Rogério","398.009.987-90");

    }
}
