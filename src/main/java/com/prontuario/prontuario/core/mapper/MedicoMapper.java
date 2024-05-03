package com.prontuario.prontuario.core.mapper;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.model.Medico;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

    MedicoEntity map(Medico medico);
    Medico map(MedicoEntity medicoEntity);
    List<Medico> map(List<MedicoEntity> medicoEntity);
}
