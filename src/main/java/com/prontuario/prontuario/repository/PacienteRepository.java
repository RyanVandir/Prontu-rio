package com.prontuario.prontuario.repository;

import com.prontuario.prontuario.core.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository  extends JpaRepository<PacienteEntity, String> {

}
