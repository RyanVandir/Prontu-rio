package com.prontuario.prontuario.core.service;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.entity.PacienteEntity;
import com.prontuario.prontuario.core.entity.ProntuarioEntity;
import com.prontuario.prontuario.core.mapper.ProntuarioMapper;
import com.prontuario.prontuario.core.port.MedicoRepositoryImplPort;
import com.prontuario.prontuario.core.port.PacienteRepositoryImplPort;
import com.prontuario.prontuario.core.port.ProntuarioRepositoryImplPort;
import com.prontuario.prontuario.core.port.ProntuarioServicePort;
import com.prontuario.prontuario.model.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProntuarioService implements ProntuarioServicePort {
    @Autowired
    private ProntuarioRepositoryImplPort prontuarioRepositoryImpl;
    @Autowired
    private MedicoRepositoryImplPort medicoRepositoryImpl;
    @Autowired
    private PacienteRepositoryImplPort pacienteRepositoryImpl;
    @Autowired
    private ProntuarioMapper prontuarioMapper;


    @Override // tá vindo da interface
    public List<Prontuario> buscarProntuarios() {
        List<ProntuarioEntity> prontuarioEntity = prontuarioRepositoryImpl.buscarProntuarios();
        return prontuarioMapper.map(prontuarioEntity);
    }

    @Override
    public Prontuario buscarId(String id) {
        ProntuarioEntity prontuarioEntity = prontuarioRepositoryImpl.buscarId(id);
        return prontuarioMapper.map(prontuarioEntity);
    }

    @Override // tá vindo da interface
    public Prontuario criarProntuario(Prontuario prontuarioRequest, String idMedico, String idPaciente) {
        prontuarioRequest.setId(UUID.randomUUID().toString());
        MedicoEntity medicoEntity = medicoRepositoryImpl.buscarId(idMedico);
        PacienteEntity pacienteEntity = pacienteRepositoryImpl.buscarId(idPaciente);
        ProntuarioEntity prontuarioEntity = prontuarioMapper.map(prontuarioRequest);
        prontuarioEntity.setMedicoEntity(medicoEntity);
        prontuarioEntity.setPacienteEntity(pacienteEntity);
        ProntuarioEntity retorno = prontuarioRepositoryImpl.criarProntuario(prontuarioEntity);
        return prontuarioMapper.map(retorno);

    }

    @Override
    public Prontuario atualizarProntuario(String id, Prontuario prontuarioRequest) {
        prontuarioRequest.setId(id);
        ProntuarioEntity prontuarioEntity = prontuarioRepositoryImpl.atualizarProntuario(prontuarioMapper.map(prontuarioRequest));
        return prontuarioMapper.map(prontuarioEntity);
    }

    @Override
    public void deleteId(String id) {
        prontuarioRepositoryImpl.deleteId(id);
    }
}