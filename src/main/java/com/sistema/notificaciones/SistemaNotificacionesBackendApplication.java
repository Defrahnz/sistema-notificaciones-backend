package com.sistema.notificaciones;

/* import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; */
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* import com.sistema.notificaciones.models.Rol;
import com.sistema.notificaciones.models.Usuario;
import com.sistema.notificaciones.models.Usuario_Rol;
import com.sistema.notificaciones.services.UsuarioService;
 */


@SpringBootApplication
public class SistemaNotificacionesBackendApplication implements CommandLineRunner{
/* 	private final Logger log=LoggerFactory.getLogger(SistemaNotificacionesBackendApplication.class);
	@Autowired
	private UsuarioService usuarioService; */

	public static void main(String[] args) {
		SpringApplication.run(SistemaNotificacionesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/* 		Usuario usuario=new Usuario();
		usuario.setNombre("Daniel");
		usuario.setApellidoP("Valdivia");
		usuario.setApellidoM("Lopez");
		usuario.setUsername("dvaldivia107");
		usuario.setPassword("123456");
		usuario.setEmail("dvaldivia98@hotmail.com");
		usuario.setTelefonoCelular("4494257983");


		//Creamos rol
		Rol rol=new Rol();
		rol.setId_rol(1);
		rol.setNombreRol("SUPER");

		Set<Usuario_Rol> usuarioRoles=new HashSet<>();
		Usuario_Rol usuarioRol=new Usuario_Rol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);

		Usuario usuarioGuardado =usuarioService.guardarUsuario(usuario, usuarioRoles);
		log.info("Usuario guardado correctamente: {}",usuarioGuardado.getUsername()); */
	}
}
