package com.prontuario.prontuario.core.mapper;

import com.prontuario.prontuario.core.entity.PacienteEntity;
import com.prontuario.prontuario.model.Paciente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    PacienteEntity map(Paciente paciente);
    Paciente map(PacienteEntity pacienteEntity);
    List<Paciente> map(List<PacienteEntity> pacienteEntity);
}
