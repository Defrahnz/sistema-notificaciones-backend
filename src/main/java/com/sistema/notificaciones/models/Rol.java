package com.sistema.notificaciones.models;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="roles")
public class Rol {
    @Id
    private Integer id_rol;
    private String nombreRol;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="rol")
    private Set<Usuario_Rol> usuarioRoles=new HashSet<>();

}
