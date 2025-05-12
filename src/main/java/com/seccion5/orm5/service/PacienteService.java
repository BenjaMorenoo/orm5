package com.seccion5.orm5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion5.orm5.model.Paciente;
import com.seccion5.orm5.repository.PacienteRepository;

@Service // decirle que es un service
public class PacienteService {
    @Autowired // conecta con el repositorio de manera automatica
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}
