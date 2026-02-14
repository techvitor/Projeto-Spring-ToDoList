package br.com.vitorferreira.todolist.Controller;

// Componente que vai atuar entre as camadas

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/
public class MyFirstController {

    /*
    * Metodo de acessos HTTP
    * GET - Buscar uma informação)
    * PUSH - Adicionar dado ou informação)
    * PUT - Alterar um dado/informação
    * DELETE - Remover um dado
    * PATCH - Alterar somente uma parte da info/dado
     */

    @GetMapping("/")
    public String primeiraMensagem(){
        return "Primeira mensagem";
    }
}
