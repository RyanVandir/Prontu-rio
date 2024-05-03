package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.core.entity.PacienteEntity;

import java.util.List;

public interface PacienteRepositoryImplPort {
    PacienteEntity addPaciente(PacienteEntity pacienteEntity);

    PacienteEntity atualizarPaciente(PacienteEntity pacienteEntity);

    List<PacienteEntity> buscarPaciente();

    PacienteEntity buscarId(String id);

    void deleteId(String id);
}
