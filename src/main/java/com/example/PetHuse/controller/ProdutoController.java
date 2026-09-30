package com.example.PetHuse.controller;


import com.example.PetHuse.entity.ProdutosEntity;
import com.example.PetHuse.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
@Autowired
    private ProdutoRepository repository;

@GetMapping
    public List<ProdutosEntity>listarTodos(){return repository.findAll();}
    @PostMapping
    public ResponseEntity<Map<String,Object>>Salvar(@RequestBody ProdutosEntity produtos){
    repository.save(produtos);{
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Produto Adiconado com Sucesso!!"));
        }


    }

}
