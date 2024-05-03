package com.prontuario.prontuario.controller;

import com.prontuario.prontuario.core.port.MedicoServicePort;
import com.prontuario.prontuario.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoServicePort medicoService;

    //Buscar
    @GetMapping
    public List<Medico> buscarMedicos() {
        return medicoService.buscarMedicos();
    }

    //Buscar por ID
    @GetMapping("/{id}")
    public Medico buscarId(@PathVariable String id) {
        return medicoService.buscarId(id); // depois alterar
    }

    //Criar
    @PostMapping
    public Medico criarMedico(@RequestBody Medico medicoRequest) {
        return medicoService.criarMedico(medicoRequest);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Medico atualizarMedico(@PathVariable String id, @RequestBody Medico medicoRequest) {
        return medicoService.atualizarMedico(id, medicoRequest);
    }

    //Deletar
    @DeleteMapping("{id}")
    public void deleteId(@PathVariable("id") String id) {
        System.out.println(id);
    }
}