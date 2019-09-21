package com.medstory.core.controller;


import com.medstory.core.enty.Paciente;
import com.medstory.core.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
public class PacienteController {


    @Autowired
    @Qualifier("servicio")
    PacienteService service;

    @PutMapping("/paciente")
    public boolean crearPaciente(@RequestBody @Valid Paciente paciente){
        return service.crear(paciente);

    }
}
