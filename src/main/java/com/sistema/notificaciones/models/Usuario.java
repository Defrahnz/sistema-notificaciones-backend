package com.sistema.notificaciones.models;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuario {
    //Básico para la generación de la BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer id_usuario;
    //Datos personales
    private String nombre;
    private String apellidoP;
    private String  apellidoM;

    //Domicilio
    private String calle;
    private String numInt;
    private String numExt;
    private String codigoPostal;
    private String  colonia;
    private String  ciudad;

    //Datos de contacto y login
    private String telefonoCasa;
    private String telefonoMovil;
    private String email;
    private String username;
    private String password;

    //Otros datos
    private Boolean activo=true;

    @ManyToMany(cascade =  CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinTable(name="usuarios_roles", joinColumns = @JoinColumn(name="usuario_id",referencedColumnName = "id_usuario"),inverseJoinColumns = @JoinColumn(name="rol_id",referencedColumnName = "id_rol"))
    private List<Rol> roles=new ArrayList<>();
    


}
