package com.prontuario.prontuario.controller;

import com.prontuario.prontuario.core.port.ProntuarioServicePort;
import com.prontuario.prontuario.model.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/prontuario")
public class ProntuarioController {


        @Autowired
        private ProntuarioServicePort prontuarioServicePort;

        @PostMapping("/{idPaciente}/medico/{idMedico}") // Post = CRIAR
        public Prontuario addProntuario(@RequestBody Prontuario prontuarioRequest, @PathVariable String idMedico, @PathVariable String idPaciente) {
            System.out.println(idMedico);
            System.out.println(idPaciente);
            return prontuarioServicePort.criarProntuario(prontuarioRequest, idMedico, idPaciente);

        }

        @GetMapping // Get = Buscar
        public List<Prontuario> buscarProntuarios() {
            return prontuarioServicePort.buscarProntuarios();

        }

        @GetMapping("/{id}") // Buscar por ID
        public Prontuario buscarId(@PathVariable String id) {
            return prontuarioServicePort.buscarId(id);
        }

    @DeleteMapping("/{id}")
        public void deleteId(@PathVariable String id) {
            prontuarioServicePort.deleteId(id);
        }
}
