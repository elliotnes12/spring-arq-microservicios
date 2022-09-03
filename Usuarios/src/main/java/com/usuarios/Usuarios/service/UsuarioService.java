package com.usuarios.Usuarios.service;


import com.usuarios.Usuarios.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {


    List<Usuario> findAll();

    Optional<Usuario> findByUsuario(String usuario);

}
