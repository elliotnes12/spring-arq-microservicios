package com.usuarios.Usuarios.service;

import com.usuarios.Usuarios.models.Usuario;
import com.usuarios.Usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{


    @Autowired
    private UsuarioRepository usuarioService;

    @Override
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @Override
    public Optional<Usuario> findByUsuario(String usuario) {


        return Optional.of(usuarioService.findByUsuario(usuario));
    }
}
