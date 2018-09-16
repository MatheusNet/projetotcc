package com.matheusaraujo.projetotcc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matheusaraujo.projetotcc.domain.Categoria;
import com.matheusaraujo.projetotcc.domain.Produto;
import com.matheusaraujo.projetotcc.repositories.CategoriaRepository;
import com.matheusaraujo.projetotcc.repositories.ProdutoRepository;


@SpringBootApplication
public class ProjetotccApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetotccApplication.class, args);
	}

	//EXECUTAR UMA AÇÃO NO MOMENTO DA EXECUÇÃO DA APLICAÇÃO
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 1200.00);
		Produto p3 = new Produto(null, "Mouse", 35.00);
		
		//ADICIONANDO OS PRODUTOS ÀS CATEGORIAS
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().add(p2);
		
		//ADICIONANDO AS CATEGORIAS AOS PRODUTOS
		p1.getCategorias().add(cat1);
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().add(cat1);
		
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
	}
	
	
	
}
