package com.heliohdd.springboothdd2_ionic_backend.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.heliohdd.springboothdd2_ionic_backend.domain.Categoria;
import com.heliohdd.springboothdd2_ionic_backend.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	@Transactional(readOnly = true)
	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")	//	Query mantida a título de exemplificar seu uso, sendo que neste caso está apenas sobrescrevendo o comando abaixo.
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome") String nome,
			@Param("categorias") List<Categoria> categorias, Pageable pageRequest);
}