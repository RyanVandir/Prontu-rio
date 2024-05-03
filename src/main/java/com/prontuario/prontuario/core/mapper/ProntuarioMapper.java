package com.prontuario.prontuario.core.mapper;

import com.prontuario.prontuario.core.entity.ProntuarioEntity;
import com.prontuario.prontuario.model.Prontuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProntuarioMapper {

    ProntuarioEntity map(Prontuario prontuario);

    Prontuario map(ProntuarioEntity prontuarioEntity);

    List<Prontuario> map(List<ProntuarioEntity> prontuarioEntity);
}
