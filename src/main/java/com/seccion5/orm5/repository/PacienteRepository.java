package com.seccion5.orm5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seccion5.orm5.model.Paciente;

@Repository // hay que decirle es que es un repositorio // y que sea una interfaz
public interface PacienteRepository extends JpaRepository<Paciente, Integer >{
    
    List<Paciente> findAll();
    


}
