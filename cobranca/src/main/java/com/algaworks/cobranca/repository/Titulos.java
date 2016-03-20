package com.algaworks.cobranca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	/**
	 * Busca por descricao
	 * @param descricao
	 * @return
	 */
	public List<Titulo> findByDescricaoContaining(String descricao);
}
