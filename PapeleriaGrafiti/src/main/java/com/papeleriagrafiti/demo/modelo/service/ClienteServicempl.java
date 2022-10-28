package com.papeleriagrafiti.demo.modelo.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.papeleriagrafiti.demo.modelo.entity.Cliente;
import com.papeleriagrafiti.demo.repository.ClienteRepository;

@Service
public class ClienteServicempl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Cliente> findAll() {
		
		return clienteRepository.findAll();
		
	}
	
	@Override
	@Transactional
	public Optional<Cliente> findById(Integer id){
		return clienteRepository.findById(id);
	}

	@Override
	
	public Cliente save(Cliente c) {
		
		return clienteRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		clienteRepository.deleteById(id);
		
	}

	

}
