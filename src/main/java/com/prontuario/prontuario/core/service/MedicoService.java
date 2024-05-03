package com.prontuario.prontuario.core.service;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.mapper.MedicoMapper;
import com.prontuario.prontuario.core.port.MedicoRepositoryImplPort;
import com.prontuario.prontuario.core.port.MedicoServicePort;
import com.prontuario.prontuario.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MedicoService implements MedicoServicePort {
    @Autowired
    private MedicoRepositoryImplPort medicoRepositoryImpl;
    @Autowired
    private MedicoMapper medicoMapper;


    @Override // tá vindo da interface
    public List<Medico> buscarMedicos() {
        List<MedicoEntity> medicoEntity = medicoRepositoryImpl.buscarMedicos();
        return medicoMapper.map(medicoEntity);
    }

    @Override
    public Medico buscarId(String id) {
        MedicoEntity medicoEntity = medicoRepositoryImpl.buscarId(id);
        return medicoMapper.map(medicoEntity);
    }

    @Override // tá vindo da interface
    public Medico criarMedico(Medico medicoRequest) {
        medicoRequest.setId(UUID.randomUUID().toString());

        MedicoEntity medicoEntity = medicoRepositoryImpl.criarMedico(medicoMapper.map(medicoRequest));
        return medicoMapper.map(medicoEntity);

    }

    @Override
    public Medico atualizarMedico(String id, Medico medicoRequest) {
        medicoRequest.setId(id);
        MedicoEntity medicoEntity = medicoRepositoryImpl.atualizarMedico(medicoMapper.map(medicoRequest));
        return medicoMapper.map(medicoEntity);
    }

    @Override
    public void deleteId(String id) {
        medicoRepositoryImpl.deleteId(id);
    }
}