package com.example.PetHuse.repository;

import com.example.PetHuse.entity.ServicosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository<ServicosEntity, Long> {
}