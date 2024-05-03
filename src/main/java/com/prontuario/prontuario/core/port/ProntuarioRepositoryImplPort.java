package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.core.entity.ProntuarioEntity;

import java.util.List;

public interface ProntuarioRepositoryImplPort {
    List<ProntuarioEntity> buscarProntuarios();

    ProntuarioEntity buscarId(String id);

    ProntuarioEntity criarProntuario(ProntuarioEntity prontuarioEntity);

    ProntuarioEntity atualizarProntuario(ProntuarioEntity prontuarioEntity);

    void deleteId(String id);
}