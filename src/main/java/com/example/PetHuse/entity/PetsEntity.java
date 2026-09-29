package com.example.PetHuse.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_pets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String especie;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private String Clientes;
}
