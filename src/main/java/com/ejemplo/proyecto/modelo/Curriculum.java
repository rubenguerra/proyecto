package com.ejemplo.proyecto.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String dni;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String empleo;
    private String cargo;
    private String titulo;
    private String ult_trabajo;
    private String empresa;
}