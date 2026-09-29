package com.example.PetHuse.controller;


import com.example.PetHuse.entity.ClientesEntity;
import com.example.PetHuse.reposity.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/clientes")
public class ClientesController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClientesEntity> listarTodos(){
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@RequestBody ClientesEntity clientes){
        repository.save(clientes);{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Map.of("menssagem","Cliente Cadrastado!"));
        }
    }
}
