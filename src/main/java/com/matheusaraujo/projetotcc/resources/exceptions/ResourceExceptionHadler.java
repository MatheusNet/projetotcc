package com.matheusaraujo.projetotcc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ResourceExceptionHadler {

	/*CLASSE AUXILIAR QUE DEVERÁ INTERCEPTAR, TRATAR E RETORNAR UMA EXCESSÃO
	 * PARA SUA IMPLEMENTAÇÃO: FOI NECESSÁRIO A CRIAÇÃO DE UM OBJETO CHAMADO 
	 * STANDARD ERROR(ERRO PADRÃO). 
	 * 
	 * A ASSINATURA PADRÃO DA CLASSE DEVERÁ SER ESTA
	 * PUBLIC RESPONSEENTITY<OBJETO CRIADO> EXCEÇÃO A SER TRATADA(
	 * MINA IMPLEMENTAÇÃO DESSA EXCESSÃO (E) HTTPSERVLET request)
	 * */
	
	//NOTAÇÃO QUE HABILITA ESTE MÉTODO PARA TRATAR EXCEÇÕES DESTE TIPO
	@ExceptionHandler(com.matheusaraujo.projetotcc.services.exceptions.ObjectNotFoundException.class)
	public ResponseEntity<StandardError> ObjectNotFoundException
	(com.matheusaraujo.projetotcc.services.exceptions.ObjectNotFoundException e,
	HttpServletRequest request){
		
		StandardError err =  new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}
	
	
	
	
}
