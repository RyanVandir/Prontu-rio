package com.prontuario.prontuario.controller;

import com.prontuario.prontuario.core.port.PacienteServicePort;
import com.prontuario.prontuario.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteServicePort pacienteServicePort;

    @PostMapping // Post = CRIAR
    public Paciente addPaciente(@RequestBody Paciente pacienteRequest) {
        return pacienteServicePort.criarPaciente(pacienteRequest);

    }

    @GetMapping // Get = Buscar
    public List<Paciente> buscarPaciente() {
        return pacienteServicePort.buscarPacientes();

    }

    @GetMapping("/{id}") // Buscar por ID
    public Paciente buscaId(@PathVariable String id) {
        return pacienteServicePort.buscarId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable String id) {
        pacienteServicePort.deleteId(id);
    }
}
