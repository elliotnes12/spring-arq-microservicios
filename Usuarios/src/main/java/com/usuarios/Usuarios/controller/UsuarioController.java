package com.usuarios.Usuarios.controller;

import com.usuarios.Usuarios.models.Usuario;
import com.usuarios.Usuarios.service.UsuarioService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;



    @GetMapping("/findAll")
    @ResponseBody
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("find/{usuario}")
    public ResponseEntity<Usuario> findByUsuario(@PathVariable("usuario") String usuario){

        Optional<Usuario> usuario1 = this.usuarioService.findByUsuario(usuario);

        if(!usuario1.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(usuario1.get());
    }
}
