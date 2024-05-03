package com.prontuario.prontuario.repository;

import com.prontuario.prontuario.core.entity.ProntuarioEntity;
import com.prontuario.prontuario.core.port.ProntuarioRepositoryImplPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProntuarioRepositoryImpl implements ProntuarioRepositoryImplPort {
    @Autowired
    private ProntuarioRepository prontuarioRepository;


    @Override
    public List<ProntuarioEntity> buscarProntuarios() {
        List<ProntuarioEntity> prontuarios = prontuarioRepository.findAll();
        return prontuarios;
    }

    @Override
    public ProntuarioEntity buscarId(String id) {
        Optional<ProntuarioEntity> prontuario = prontuarioRepository.findById(id);
        if (prontuario.isEmpty()) {
            throw new RuntimeException("prontuario não encontrado!");
        }
        return prontuario.get();
    }

    @Override
    public ProntuarioEntity criarProntuario(ProntuarioEntity prontuarioEntity) {
        ProntuarioEntity prontuario = prontuarioRepository.save(prontuarioEntity);
        return prontuario;
    }

    @Override
    public ProntuarioEntity atualizarProntuario(ProntuarioEntity prontuarioEntity) {
        Optional<ProntuarioEntity> prontuario = prontuarioRepository.findById(prontuarioEntity.getId());
        if (prontuario.isEmpty()) {
            throw new RuntimeException("prontuario não encontrado!");
        }
        return prontuarioRepository.saveAndFlush(prontuarioEntity);
    }

    @Override
    public void deleteId(String id) {
        Optional<ProntuarioEntity> prontuario = prontuarioRepository.findById(id);
        if (prontuario.isEmpty()) {
            throw new RuntimeException("prontuario não encontrado!");
        }
        prontuarioRepository.deleteById(id);
    }
}