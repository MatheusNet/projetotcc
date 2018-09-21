package com.matheusaraujo.projetotcc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusaraujo.projetotcc.domain.Categoria;
import com.matheusaraujo.projetotcc.domain.Cliente;
import com.matheusaraujo.projetotcc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;
/*
 * ESTA CLASSE DE SERVIÇOS VAI BUSCAR O REPOSITÓRIO CATEGORIA
 * QUE POR SUA VEZ, VAI ATÉ A BASE DE DADOS BUSCAR UMA CATEGORIA
 
 * 
 * */
@Service
public class ClienteService {
	
	/*COMO ESTA CLASSE NECESSITA DE UM DADO VINDO DA CATEGORIA REPOSITORY 
	 * PRECISAREI DECLARAR UMA DEPENDÊNCIA
	 * 
	 * */
	
	//ESTA ANOTAÇÃO INSTANCIA AUTOMATICAMENTE O OBJETO CATEGORIA REPOSITORY
	@Autowired 
	private ClienteRepository repo; 

	//CRIAND UMA OPERAÇÃO QUE VAI BUSCAR UMA CATEGORIA COM TRATAMENTO DE EXCEÇÃO
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		
		//MÉTODO RESPONSÁVEL POR BUSCAR A CATEGORIA PELO ID NO BD
		
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new com.matheusaraujo.projetotcc.services.exceptions.ObjectNotFoundException(

				"Cliente não encontrado!  ID: "  + id + "Tipo:  "
						+ Categoria.class.getName()));
		
	}
	
}
