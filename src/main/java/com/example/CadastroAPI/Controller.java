package com.example.CadastroAPI;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Hello, world!!! Essa é uma mensagem da minha primeira rota.";
    }

}
