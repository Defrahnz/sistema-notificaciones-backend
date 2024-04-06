package com.sistema.notificaciones.models;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy="usuario")
    @JsonIgnore
    private Set<Usuario_Rol> usuarioRoles=new HashSet<>();
    
    @OneToMany(mappedBy = "usuario")
    private Set<Usuario_Mensaje> usuarioMensajes=new HashSet<>();

    @ManyToMany(cascade =  CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinTable(name="usuarios_zonas",joinColumns = @JoinColumn(name="usiario_id",referencedColumnName ="id_usuario"),inverseJoinColumns = @JoinColumn(name="zona_id",referencedColumnName = "id_zona"))
    private List<Zona> zonas=new ArrayList<>();

}
