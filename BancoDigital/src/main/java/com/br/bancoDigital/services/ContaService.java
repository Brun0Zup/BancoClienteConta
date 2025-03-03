package com.br.bancoDigital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bancoDigital.models.Cliente;
import com.br.bancoDigital.models.Conta;
import com.br.bancoDigital.repositories.ClienteRepository;
import com.br.bancoDigital.repositories.ContaRepository;

@Service
public class ContaService {

	
	@Autowired
	ContaRepository contaRepository;
	
	@Autowired 
	ClienteRepository clienteRepository;
	
	public String save (Conta conta, Cliente cliente) {
		conta.setCliente(cliente);
		contaRepository.save(conta);
		
		return "successfully created account!!!!!!\n";
	}
	
	
	public Iterable<Conta> exibirMyContas(){
		return contaRepository.findAll();
	}
	
	
}
