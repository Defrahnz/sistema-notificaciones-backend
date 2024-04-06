package com.sistema.notificaciones.services;

import java.util.*;

import com.sistema.notificaciones.models.Usuario;
import com.sistema.notificaciones.models.Usuario_Rol;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<Usuario_Rol> usuarioRoles) throws Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Integer id_usuario);
}
