package com.sistema.notificaciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.notificaciones.models.Rol;
import com.sistema.notificaciones.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> obtenerTodosLosRoles() {
      return rolRepository.findAll();
    }


}
