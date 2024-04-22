package com.sistema.notificaciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.notificaciones.models.Modulo;
import com.sistema.notificaciones.repository.ModuloRepository;

@Service
public class ModuloServiceImpl implements ModuloService{
    @Autowired
    private ModuloRepository moduloRepository;

    @Override
    public List<Modulo> obtenerModulosActivos() {
       return moduloRepository.findByActivoTrue();
    }

}
