package com.matheusaraujo.projetotcc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusaraujo.projetotcc.domain.Categoria;
import com.matheusaraujo.projetotcc.repositories.CategoriaRepository;
/*
 * ESTA CLASSE DE SERVIÇOS VAI BUSCAR O REPOSITÓRIO CATEGORIA
 * QUE POR SUA VEZ, VAI ATÉ A BASE DE DADOS BUSCAR UMA CATEGORIA
 
 * 
 * */
@Service
public class CategoriaService {
	
	/*COMO ESTA CLASSE NECESSITA DE UM DADO VINDO DA CATEGORIA REPOSITORY 
	 * PRECISAREI DECLARAR UMA DEPENDÊNCIA
	 * 
	 * */
	
	//ESTA ANOTAÇÃO INSTANCIA AUTOMATICAMENTE O OBJETO CATEGORIA REPOSITORY
	@Autowired 
	private CategoriaRepository repo; 

	//CRIAND UMA OPERAÇÃO QUE VAI BUSCAR UMA CATEGORIA
	public Categoria buscar(Integer id) {
		//MÉTODO RESPONSÁVEL POR BUSCAR A CATEGORIA PELO ID NO BD
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
}
