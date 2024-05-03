package com.prontuario.prontuario.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class ProntuarioEntity {
    @Id
    private String id;
    private String alergias;
    private String medicamentos;
    private String historicoMedico;
    @ManyToOne
    private MedicoEntity medicoEntity;
    @ManyToOne
    private PacienteEntity pacienteEntity;
}
