package com.ejemplo.proyecto.servicios;

import com.ejemplo.proyecto.modelo.Curriculum;
import com.ejemplo.proyecto.repositorio.CurriculumRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumServicio implements ICurriculumServicio {

    @Autowired
    public CurriculumRepositorio curriculumRepositorio;

    @Override
    public List<Curriculum> verCurriculum() {
        return curriculumRepositorio.findAll();
    }

    @Override
    public void actualizarCurriculum(Curriculum curriculum) {
        curriculumRepositorio.save(curriculum);

    }

}
