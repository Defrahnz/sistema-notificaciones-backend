package com.sistema.notificaciones.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.notificaciones.models.Modulo;
import com.sistema.notificaciones.services.ModuloService;


@RestController
@RequestMapping("/modulos")
@CrossOrigin("*")
public class ModuloController {
    @Autowired
    private ModuloService moduloService;

    @GetMapping("/activos")
    public List<Modulo> obtenerModulosActivos(){
        return moduloService.obtenerModulosActivos();
    }

}
