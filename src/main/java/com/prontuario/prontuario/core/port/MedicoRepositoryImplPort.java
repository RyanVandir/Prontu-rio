package com.prontuario.prontuario.core.port;

import com.prontuario.prontuario.core.entity.MedicoEntity;

import java.util.List;

public interface MedicoRepositoryImplPort {
    List<MedicoEntity> buscarMedicos();

    MedicoEntity buscarId(String id);

    MedicoEntity criarMedico(MedicoEntity medicoEntity);

    MedicoEntity atualizarMedico(MedicoEntity medicoEntity);

    void deleteId(String id);
}