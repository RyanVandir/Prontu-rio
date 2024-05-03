package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.model.Prontuario;

import java.util.List;

public interface ProntuarioServicePort {
    List<Prontuario> buscarProntuarios();

    Prontuario buscarId(String id);

    Prontuario criarProntuario(Prontuario prontuarioRequest, String idMedico, String idPaciente);

    Prontuario atualizarProntuario(String id, Prontuario prontuarioRequest);

    void deleteId(String id);
}