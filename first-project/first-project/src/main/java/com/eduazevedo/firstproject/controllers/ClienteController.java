package com.eduazevedo.firstproject.controllers;

import com.eduazevedo.firstproject.Cliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @RequestMapping("/clientes")
    public Cliente cliente(@RequestParam(value = "name", defaultValue = "Nome indefinido") String name) {
        return new Cliente(name);
    }
}
