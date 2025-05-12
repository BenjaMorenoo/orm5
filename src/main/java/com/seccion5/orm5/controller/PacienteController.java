package com.seccion5.orm5.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion5.orm5.model.Paciente;
import com.seccion5.orm5.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController //decirle que es un apiRest 
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    @Autowired //decirle que se conecte con el servicio de manera automatica
    private PacienteService pacienteService; 

    @GetMapping
    public ResponseEntity<List<Paciente>> getPacientes() {
        List<Paciente> pacientes = pacienteService.findAll();
        if (pacientes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(pacienteService.findAll(),HttpStatus.OK);
    }
    
    @PostMapping
    public Paciente postPaciente(@RequestBody Paciente Paciente) {
        return pacienteService.guardarPaciente(Paciente);
        
    }
    
}
