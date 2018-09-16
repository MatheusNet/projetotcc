package com.matheusaraujo.projetotcc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matheusaraujo.projetotcc.domain.Categoria;
import com.matheusaraujo.projetotcc.repositories.CategoriaRepository;


@SpringBootApplication
public class ProjetotccApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetotccApplication.class, args);
	}

	//EXECUTAR UMA AÇÃO NO MOMENTO DA EXECUÇÃO DA APLICAÇÃO
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
	}
	
	
	
}
