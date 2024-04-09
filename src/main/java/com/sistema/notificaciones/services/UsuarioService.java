package com.sistema.notificaciones.services;

import com.sistema.notificaciones.models.Usuario;
public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario) throws Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Integer id_usuario);
}
