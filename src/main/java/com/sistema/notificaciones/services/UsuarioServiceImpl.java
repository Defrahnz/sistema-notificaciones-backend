package com.sistema.notificaciones.services;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.notificaciones.models.Usuario;
import com.sistema.notificaciones.models.Usuario_Rol;
import com.sistema.notificaciones.repository.RolRepository;
import com.sistema.notificaciones.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final Logger log=LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<Usuario_Rol> usuarioRoles) throws Exception {
        Usuario usuarioLocal=usuarioRepository.findByusername(usuario.getUsername()); 
        if(usuarioLocal!=null){
            log.warn("El usuario ya esta registrado {}");
            throw new Exception("El usuario ya esta");
        }else{
            for(Usuario_Rol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal=usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByusername(username);
    }

    @Override
    public void eliminarUsuario(Integer id_usuario) {
        usuarioRepository.deleteById(id_usuario);
    }
    

}
