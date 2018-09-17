package com.matheusaraujo.projetotcc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * IMPLEMENTAÇÃO PADRÃO DE EXCEÇÃO
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
