package com.prontuario.prontuario.core.service;

import com.prontuario.prontuario.core.entity.PacienteEntity;
import com.prontuario.prontuario.core.mapper.PacienteMapper;
import com.prontuario.prontuario.core.port.PacienteRepositoryImplPort;
import com.prontuario.prontuario.core.port.PacienteServicePort;
import com.prontuario.prontuario.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PacienteService implements PacienteServicePort {
    @Autowired
    private PacienteRepositoryImplPort pacienteRepositoryImplPort;
    @Autowired
    private PacienteMapper pacienteMapper;

    @Override //TÁ VINDO DA INTERFACE
    public Paciente criarPaciente(Paciente pacienteRequest) {
        pacienteRequest.setId(UUID.randomUUID().toString());
        PacienteEntity pacienteEntity = pacienteRepositoryImplPort.addPaciente(pacienteMapper.map(pacienteRequest));
        return pacienteMapper.map(pacienteEntity);
    }

    @Override
    public Paciente atualizarPaciente(String id, Paciente pacienteRequest) {
        PacienteEntity pacienteEntity = pacienteRepositoryImplPort.atualizarPaciente(pacienteMapper.map(pacienteRequest));
        return pacienteMapper.map(pacienteEntity);
    }

    @Override
    public List<Paciente> buscarPacientes() {
        List<PacienteEntity> pacienteEntity = pacienteRepositoryImplPort.buscarPaciente();
        return pacienteMapper.map(pacienteEntity);
    }

    @Override
    public Paciente buscarId(String id) {
        PacienteEntity pacienteEntity = pacienteRepositoryImplPort.buscarId(id);
        return pacienteMapper.map(pacienteEntity);
    }

    @Override
    public void deleteId(String id) {
        pacienteRepositoryImplPort.deleteId(id);
    }
}