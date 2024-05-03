package com.prontuario.prontuario.repository;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.entity.PacienteEntity;
import com.prontuario.prontuario.core.port.PacienteRepositoryImplPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteRepositoryImpl implements PacienteRepositoryImplPort {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public PacienteEntity addPaciente(PacienteEntity pacienteEntity) {
        PacienteEntity paciente = pacienteRepository.save(pacienteEntity);
        return paciente;
    }

    @Override
    public PacienteEntity atualizarPaciente(PacienteEntity pacienteEntity) {
        Optional<PacienteEntity> paciente = pacienteRepository.findById(pacienteEntity.getId());
        if (paciente.isEmpty()) {
            throw new RuntimeException("Paciente não encontrado!");
        }
        return pacienteRepository.saveAndFlush(pacienteEntity);
    }

    @Override
    public List<PacienteEntity> buscarPaciente() {
        List<PacienteEntity> pacientes = pacienteRepository.findAll();
        return pacientes;
    }

    @Override
    public PacienteEntity buscarId(String id) {
        Optional<PacienteEntity> pacienteId = pacienteRepository.findById(id);
        return pacienteId.get();
    }

    @Override
    public void deleteId(String id) {
        pacienteRepository.deleteById(id);
    }


}
