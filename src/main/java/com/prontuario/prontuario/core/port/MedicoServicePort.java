package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.model.Medico;

import java.util.List;

public interface MedicoServicePort {
    List<Medico> buscarMedicos();

    Medico buscarId(String id);

    Medico criarMedico(Medico medicoRequest);

    Medico atualizarMedico(String id, Medico medicoRequest);

    void deleteId(String id);
}