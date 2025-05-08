package com.seccion5.orm5.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity // transformar el modelo a una entidad para la db
@Table(name = "paciente") // tansformar en una tabla con el nombre
public class Paciente {
    
    // las anotaciones siempre van encima del atributo en el que se requiera


    @Id //hacer que el atributo se convierta en ID o clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // esto genera de forma automatica la PK para no crearla manual
    private int id;

    @Column(length = 12, unique = true, nullable = false)
    private String rut;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(nullable = false)
    private LocalDate fechaNacimiento;

    @Column(length = 250, nullable = false)
    private String correo;
}
