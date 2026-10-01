package com.example.PetHuse.service;

import com.example.PetHuse.entity.ServicosEntity;
import com.example.PetHuse.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository repository;

    public List<ServicosEntity> listarTodos() {
        return repository.findAll();
    }

    public ServicosEntity salvar(ServicosEntity servico) {
        // Pode adicionar regras de negócio aqui futuramente (ex: verificar se o serviço já existe)
        return repository.save(servico);
    }
}