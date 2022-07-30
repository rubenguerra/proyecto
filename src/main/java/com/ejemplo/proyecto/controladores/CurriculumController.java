package com.ejemplo.proyecto.controladores;

import com.ejemplo.proyecto.modelo.Curriculum;
import com.ejemplo.proyecto.servicios.ICurriculumServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDatos")
@CrossOrigin(origins = "http://localhost:4200")
public class CurriculumController {

    @Autowired
    private ICurriculumServicio curriculumServicio;

    @PutMapping("/curriculum")
    public void agregarCurriculum(@RequestBody Curriculum curriculum){
        curriculumServicio.actualizarCurriculum(curriculum);
    }

    @GetMapping("/datos")
    @ResponseBody
    public List<Curriculum> verCurriculum(){
        return curriculumServicio.verCurriculum();
    }


}
