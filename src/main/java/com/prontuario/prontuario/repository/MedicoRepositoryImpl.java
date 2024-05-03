package com.prontuario.prontuario.repository;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.port.MedicoRepositoryImplPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MedicoRepositoryImpl implements MedicoRepositoryImplPort {
    @Autowired
    private MedicoRepository medicoRepository;


    @Override
    public List<MedicoEntity> buscarMedicos() {
        List<MedicoEntity> medicos = medicoRepository.findAll();
        return medicos;
    }

    @Override
    public MedicoEntity buscarId(String id) {
        Optional<MedicoEntity> medico = medicoRepository.findById(id);
        if (medico.isEmpty()) {
            throw new RuntimeException("Medico não encontrado!");
        }
        return medico.get();
    }

    @Override
    public MedicoEntity criarMedico(MedicoEntity medicoEntity) {
        MedicoEntity medico = medicoRepository.save(medicoEntity);
        return medico;
    }

    @Override
    public MedicoEntity atualizarMedico(MedicoEntity medicoEntity) {
        Optional<MedicoEntity> medico = medicoRepository.findById(medicoEntity.getId());
        if (medico.isEmpty()) {
            throw new RuntimeException("Medico não encontrado!");
        }
        return medicoRepository.saveAndFlush(medicoEntity);
    }

    @Override
    public void deleteId(String id) {
        Optional<MedicoEntity> medico = medicoRepository.findById(id);
        if (medico.isEmpty()) {
            throw new RuntimeException("Medico não encontrado!");
        }
        medicoRepository.deleteById(id);
    }
}