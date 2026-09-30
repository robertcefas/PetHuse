package com.example.PetHuse.repository;

import com.example.PetHuse.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClientesEntity,Long> {
}
