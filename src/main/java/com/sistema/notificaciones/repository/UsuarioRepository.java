package com.sistema.notificaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.notificaciones.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    public Usuario findByusername(String username);

}
