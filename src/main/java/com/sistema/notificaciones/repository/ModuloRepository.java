package com.sistema.notificaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.notificaciones.models.Modulo;

public interface ModuloRepository extends JpaRepository<Modulo,Integer> {
    List<Modulo> findByActivoTrue();
}
