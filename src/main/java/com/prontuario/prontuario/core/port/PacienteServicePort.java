package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.model.Paciente;

import java.util.List;

public interface PacienteServicePort {
    List<Paciente> buscarPacientes();

    Paciente buscarId(String id);

    Paciente criarPaciente(Paciente pacienteRequest);

    Paciente atualizarPaciente(String id, Paciente pacienteRequest);

    void deleteId(String id);
}