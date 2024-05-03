package com.prontuario.prontuario.repository;

import com.prontuario.prontuario.core.entity.MedicoEntity;
import com.prontuario.prontuario.core.entity.ProntuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<ProntuarioEntity, String > {

}
