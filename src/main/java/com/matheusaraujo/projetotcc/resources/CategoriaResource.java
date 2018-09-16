package com.matheusaraujo.projetotcc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matheusaraujo.projetotcc.domain.Categoria;

@RestController// NOTAÇÃO INDICATIVA DE UM CONTROLLER REST
@RequestMapping(value = "/categorias")//END POINT INFORMADO 
public class CategoriaResource {

	//ASSOCIANDO ESTE MÉTODO A UM VERBO HTTP
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> Listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		/*CRIANDO UM A LISTA DE CATEGORIAS
		 * O LIST É UMA INTERFACE, E POR ISSO NÃO PODE
		 * SER INSTANCIADA. ENTÃO POSSO INSTANCIAR UMA CLASSE
		 * QUE IMPLEMENTE ESTA INTERFACE COMO É O CASO DE ARRAYLIST
		 *  
		 *  */
		List<Categoria>  lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
}
