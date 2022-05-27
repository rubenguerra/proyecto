package com.ejemplo.proyecto.servicios;

import com.ejemplo.proyecto.modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {

    //Hacemos la declaración de los métodos
    public List<Usuario> verUsuarios();
    public void crearUsuario(Usuario usuario);
    public void borrarUsuario(Long id);
    public Usuario buscarUsuario(Long id);
}
