package com.sistema.notificaciones.controllers;

import java.util.*;

/* import org.slf4j.Logger;
import org.slf4j.LoggerFactory; */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.notificaciones.models.Rol;
import com.sistema.notificaciones.models.Usuario;
import com.sistema.notificaciones.models.Usuario_Rol;
import com.sistema.notificaciones.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    /* private final Logger log=LoggerFactory.getLogger(UsuarioController.class); */
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        //Para realizar el username
        Random random=new Random();
        int numAleatorio = random.nextInt(101);
        String temp=usuario.getApellidoP().substring(0,3).toLowerCase()+usuario.getNombre().substring(0,2).toLowerCase()+numAleatorio;
        usuario.setUsername(temp);
        Set<Usuario_Rol> usuarioRoles=new HashSet<>();
        
        Rol rol = new Rol();
        //Rol admin
        rol.setId_rol(2);
        rol.setNombreRol("ADMIN");

        Usuario_Rol usuarioRol=new Usuario_Rol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario, usuarioRoles);
    }

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Integer usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }


}
