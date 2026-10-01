package com.example.PetHuse.controller;

import com.example.PetHuse.entity.ServicosEntity;
import com.example.PetHuse.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    @Autowired
    private ServicosService service;

    @GetMapping
    public List<ServicosEntity> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ServicosEntity servico) {
        service.salvar(servico);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Serviço adicionado com Sucesso!!"));
    }
}