package br.com.senai.nextlevelcast.dto;

import br.com.senai.nextlevelcast.model.Categoria;

public record SerieDTO(Long id,
		String titulo,
		Integer totalTemporadas,
		Double avaliacao,
		Categoria genero,
		String atores,
		String poster,
		String sinopse) {

	
}
