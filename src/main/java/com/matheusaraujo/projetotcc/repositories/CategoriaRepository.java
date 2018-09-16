package com.matheusaraujo.projetotcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusaraujo.projetotcc.domain.Categoria;
/*COM A ANOTAÇÃO, TRANFORMO MINHA CLASSE EM REPOSITÓRIO
 * ESTA INTERFACE HERDA DE JPA REPOSITORY
 * ONDE NELA, TENHO QUE INFORMAR O OBJETO E O IDENTIFICADOR A SER ACESSADO
 * NO CASO: O OBJETO CATEGORIA, E SEU IDENTIFICADOR INT
 *   *  
 *  */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	
	
	
}
