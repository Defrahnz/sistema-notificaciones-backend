package com.sistema.notificaciones.services;

import java.util.List;

import com.sistema.notificaciones.models.Modulo;

public interface ModuloService {
    List<Modulo> obtenerModulosActivos();
}
