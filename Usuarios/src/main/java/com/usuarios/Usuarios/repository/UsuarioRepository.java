package com.usuarios.Usuarios.repository;

import com.usuarios.Usuarios.models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario,Long> {

     @Query("SELECT u FROM Usuario u WHERE u.usuario = ?1")
     Usuario findByUsuario(String usuario);

     List<Usuario> findAll();
}
