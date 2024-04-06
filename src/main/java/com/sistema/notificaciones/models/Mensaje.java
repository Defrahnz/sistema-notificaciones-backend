package com.sistema.notificaciones.models;

import java.sql.Date;
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
@Table(name="mensajes")
public class Mensaje {
    //Básico para la BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_mensaje;

    //Demas variables
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String horaInicio;
    private String  horaFin;
    private Boolean activo_inactivo=true;
    private String mensaje;

    //Otros Datos
    @OneToMany(cascade = CascadeType.ALL, mappedBy="mensaje")
    @JsonIgnore
    private Set<Usuario_Mensaje> usuarioMensajes=new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="mensajes_zonas",joinColumns = @JoinColumn(name="mensaje_id",referencedColumnName="id_mensaje"),inverseJoinColumns = @JoinColumn(name="zona_id",referencedColumnName ="id_zona"))
    private List<Zona> zonas=new ArrayList<>();


}
