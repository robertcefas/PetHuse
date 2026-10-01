package com.example.PetHuse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "db_servicos")
public class ServicosEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String nome;
@Column(nullable = false)
private String descricao;
@Column(nullable = false)
private String preco;
@Column(nullable = false)
private String minutos;

}