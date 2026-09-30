package com.example.PetHuse.repository;

import com.example.PetHuse.entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutosEntity,Long> {
}
