package com.prontuario.prontuario.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString
public class PacienteEntity {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private String email;
    @OneToMany
    private List<ProntuarioEntity> prontuarios;
}
