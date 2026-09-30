package com.example.PetHuse.repository;

import com.example.PetHuse.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioReposity extends JpaRepository<FuncionarioEntity, Long> {
}
