package com.example.PetHuse.controller;


import com.example.PetHuse.entity.PetsEntity;
import com.example.PetHuse.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    private PetsRepository repository;

    @GetMapping
    public List<PetsEntity>listarTodos() {
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<Map<String,String>>Salvar(@RequestBody PetsEntity pets){
        repository.save(pets);
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Pets Salvo no sistema!"));
    }

}
