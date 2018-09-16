package com.matheusaraujo.projetotcc.resources;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.ssi.ResponseIncludeWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matheusaraujo.projetotcc.domain.Categoria;
import com.matheusaraujo.projetotcc.services.CategoriaService;

@RestController// NOTAÇÃO INDICATIVA DE UM CONTROLLER REST
@RequestMapping(value = "/categorias")//END POINT INFORMADO 
public class CategoriaResource {
	
	//DECLARANDO E GERENCIANDO UMA INJEÇÃO DE DEPENDÊNCIA
	@Autowired	
	private CategoriaService service;

	/*ASSOCIANDO ESTE MÉTODO A UM VERBO HTTP 
	 * O ATRIBUTO VALUE ACRESCENTA UM APELIDO A URL
	 * O ATRIBUTO PATHVARIABLE PEGA O VALOR DO APELIDO,  TORNA - O
	 *  UMA VARIÁVEL E ATRIBUI O VALOR DELE AO DA VARIÁVEL JÁ EXISTENTE
	 * */	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		/*RESPONSE ENTITY É UM TIPO ESPECIAL QUE 
		 * ARMAZENA  E ENCAPSULA VÁRIAS INFORMAÇÕES 
		 * DE UMA RESPOSTA HTTP PARA UM SERVIÇO REST
		 * 
		 * O ATRIBUTO INTERROGAÇÃO GENERALIZA O TIPO DA RESPOSTA HTTP
		 * PODE ENCONTRAR COMO NÃO PODE		 * */
		
		//BUSCANDO A CATEGORIA
		Categoria obj = service.buscar(id);
		
				
		//RETORNANDO UM OBJETO DO TIPO RESPONSE ENTITY E UM OBJ(CATEGORIA)
		return ResponseEntity.ok().body(obj);
	}
}
