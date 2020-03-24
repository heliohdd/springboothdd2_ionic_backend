package com.heliohdd.springboothdd2_ionic_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohdd.springboothdd2_ionic_backend.domain.Estado;
import com.heliohdd.springboothdd2_ionic_backend.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}