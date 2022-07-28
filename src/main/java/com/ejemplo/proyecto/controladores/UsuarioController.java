package com.ejemplo.proyecto.controladores;

import com.ejemplo.proyecto.modelo.Usuario;
import com.ejemplo.proyecto.servicios.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiUsuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private IUsuarioServicio usuarioServicio;

    @PostMapping("/nuevo")
    public void agregarUsuario(@RequestBody Usuario usuario){
        usuarioServicio.crearUsuario(usuario);
    }

    @PostMapping("/login")
    public void validarUsuario(@RequestBody Usuario usuario){
        usuarioServicio.chequearUsuario(usuario);
    }

    @GetMapping("/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioServicio.verUsuarios();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServicio.borrarUsuario(id);
    }
}
