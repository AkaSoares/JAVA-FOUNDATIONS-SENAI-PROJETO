package br.com.senai.nextlevelcast.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.nextlevelcast.dto.SerieDTO;
import br.com.senai.nextlevelcast.model.Serie;
import br.com.senai.nextlevelcast.repository.SerieRepository;

@Service
public class SerieService {

	@Autowired
	private SerieRepository repositorio;
	
	public List<SerieDTO> obterTodasAsSeries(){
		return coverteDados(repositorio.findAll());
	        }
	
	
	public List<SerieDTO> obterTop5Series() {
	    return coverteDados
	    	(repositorio.findTop5ByOrderByAvaliacaoDesc());
	}
	
	
	private List<SerieDTO> coverteDados(List<Serie> series) {
		return series.stream()
		        .map(s -> new SerieDTO(s.getId(), 
		        		s.getTitulo(), 
		        		s.getTotalTemporadas(), 
		        		s.getAvaliacao(), 
		        		s.getGenero(), 
		        		s.getAtores(), 
		        		s.getPoster(), 
		        		s.getSinopse()))
		        .collect(Collectors.toList());
		
	}
	
	
	
	
	public List<SerieDTO> obterLancamentos() {
	    return repositorio.findTop4ByOrderByIdDesc()
	        .stream()
	        .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
	                s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
	        .collect(Collectors.toList());
	}

		
	}

