package com.example.PetHuse.repository;

import com.example.PetHuse.entity.PetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends JpaRepository<PetsEntity,Long> {



}
