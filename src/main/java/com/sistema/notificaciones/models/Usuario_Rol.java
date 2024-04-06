package com.sistema.notificaciones.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_roles")
public class Usuario_Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioRolId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    @ManyToOne
    private Rol rol;
}
