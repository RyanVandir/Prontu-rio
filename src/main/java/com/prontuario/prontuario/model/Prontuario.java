package com.prontuario.prontuario.model;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.entity.PacienteEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Prontuario {
    private String id;
    private String alergias;
    private String medicamentos;
    private String historicoMedico;
    private Medico medicoEntity;
    private Paciente pacienteEntity;
}
