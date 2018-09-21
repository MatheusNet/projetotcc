package com.matheusaraujo.projetotcc.domain.enums;

public enum TipoCliente {

	/*
	 * UM ENUMERADOR UMA VEZ CRIADO NÃO PODE MAIS SER ALTERADO
	 * POR TANTO, SÓ METODOS GEEEEET| E SEU CONSTRUTOR SEMPRE É PRIVADO
	 * 
	 * */
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		
		this.cod = cod;
		this.descricao = descricao;
		
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	/*
	 * CRIAR UMA OPERAÇÃO QUE PERCORRA A ENUMERAÇÃO
	 * SEGUNDO UM CÓDIGO PASSADO
	 * 
	 * MÉTODO STATIC: É EXECUTADO SEM PRECISAR INSTANCIAR UM OBJETO
	 * */
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		/*
		 * FAZENDO UMA BUSCA PELO VALOR X DENTRE TODOS 
		 * OS VALORES POSSÍVEIS DENTRO DO OBJETO TIPO CLIENTE
		 * */
		for(TipoCliente x: TipoCliente.values()) {
			if(cod.equals(x.getCod())){
				return x;
			}
			
		}
		
		//SE NÃO ENCONTRAR O CÓDIGO ESTA EXCESSÃO SERÁ RETORNADA
		throw new IllegalArgumentException("Id inválido" + cod);
	}
	
	
}
