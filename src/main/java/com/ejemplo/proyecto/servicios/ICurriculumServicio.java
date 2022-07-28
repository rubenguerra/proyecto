package com.ejemplo.proyecto.servicios;

import com.ejemplo.proyecto.modelo.Curriculum;

import java.util.List;

public interface ICurriculumServicio {

    //En esta interfaz hacemos declaración de métodos que se van a implentar.
    public List<Curriculum> verCurriculum();

    public void actualizarCurriculum(Curriculum curriculum);

}
