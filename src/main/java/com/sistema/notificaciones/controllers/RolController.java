package com.sistema.notificaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.notificaciones.models.Rol;
import com.sistema.notificaciones.services.RolService;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RolController {
    @Autowired
    private RolService rolService;

    @GetMapping("/")
    public ResponseEntity<List<Rol>> obtenerRoles(){
        List<Rol> roles=rolService.obtenerTodosLosRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
}
