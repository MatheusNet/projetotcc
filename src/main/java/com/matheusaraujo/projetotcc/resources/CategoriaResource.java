package com.matheusaraujo.projetotcc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController// NOTAÇÃO INDICATIVA DE UM CONTROLLER REST
@RequestMapping(value = "/categorias")//END POINT INFORMADO 
public class CategoriaResource {

	//ASSOCIANDO ESTE MÉTODO A UM VERBO HTTP
	@RequestMapping(method = RequestMethod.GET)
	public String Listar() {
		return "RESTE ESTÁ FUNCIONANDO";
	}
}
