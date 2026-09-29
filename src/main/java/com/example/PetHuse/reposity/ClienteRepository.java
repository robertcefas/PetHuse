package com.example.PetHuse.reposity;

import com.example.PetHuse.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClientesEntity,Long> {
}
