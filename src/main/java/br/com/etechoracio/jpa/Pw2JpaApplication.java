package br.com.etechoracio.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.GrupoUsuario;
import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.repository.GrupoUsuarioRepository;
import br.com.etechoracio.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private GrupoUsuarioRepository grupoUsuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = Usuario.builder().nome("horacio")
				                          .senha("etec123")
				               .build();
		usuarioRepository.save(usuario);
		
		
		Usuario usuario1 = Usuario.builder().nome("Roberto")
                .senha("123456")
                .grupos(1)
                .build();
		grupoUsuarioRepository.save(usuario1);
		
		Usuario usuario2 = Usuario.builder().nome("Augusto")
                .senha("654321")
                .grupos(1)
                .build();
		grupoUsuarioRepository.save(usuario2);
	}



}

