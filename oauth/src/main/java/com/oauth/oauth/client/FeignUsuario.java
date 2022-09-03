package com.oauth.oauth.client;


import com.oauth.oauth.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "servicio-usuarios")
public interface FeignUsuario {

    @GetMapping("find/{usuario}")
    ResponseEntity<Usuario> findByUsuario(@PathVariable("usuario") String usuario);
}
