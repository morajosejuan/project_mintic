package com.papeleriagrafiti.demo.modelo.service;



import java.util.Optional;

import com.papeleriagrafiti.demo.modelo.entity.Cliente;

public interface ClienteService {
	public Iterable<Cliente>findAll();
	public Optional<Cliente> findById(Integer id);
	public Cliente save(Cliente c);
	public void deleteById(Integer id);
	
	

}
