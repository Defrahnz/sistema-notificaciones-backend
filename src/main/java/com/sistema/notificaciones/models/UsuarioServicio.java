package com.sistema.notificaciones.models;

import java.util.*;

import jakarta.persistence.CascadeType;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuariosServicio")
public class UsuarioServicio {
    //Datos para la BD
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_usuarioServicio;
    
    //Datos personales
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    //Datos vivienda
    private String calle;
    private String numInt;
    private String numExt;
    private String codigoPostal;
    private String ciudad;

    //Datos contacto
    private String telefonoFijo;
    private String celular;
    private String numeroContrato;

    //Otros datos
    @ManyToMany(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinTable(name="usuariosServicios_zonas",joinColumns = @JoinColumn(name="usuarioServicio_id",referencedColumnName = "id_usuarioServicio"),inverseJoinColumns = @JoinColumn(name="zona_id",referencedColumnName = "id_zona"))
    private List<Zona> zonas=new ArrayList<>();


}
