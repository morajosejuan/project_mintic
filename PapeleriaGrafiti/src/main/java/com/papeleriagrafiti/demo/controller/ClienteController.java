package com.papeleriagrafiti.demo.controller;

import com.papeleriagrafiti.demo.modelo.entity.Cliente;
import com.papeleriagrafiti.demo.modelo.service.ClienteService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"*"})//dominio del api y puerto localhots:9095
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
        public Cliente guardar(@RequestBody Cliente cliente){
            return clienteService.save(cliente);
        }
        
        @GetMapping("/listar")
        public Iterable<Cliente>listarTodos(){
            return clienteService.findAll();
        }
        
        @GetMapping("{id}")
        public Optional<Cliente>buscarPorId(@PathVariable Integer id){
            return clienteService.findById(id);
        }
        
        @DeleteMapping("{id}")
        public void elimiar(@PathVariable Integer id){
            clienteService.deleteById(id);
        }
        
        

}
