package br.com.hellospringboot.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import antlr.collections.List;
import br.com.hellospringboot.entity.User;

@Service
public class UserService {

	
	//UserRepository userRepository;
		
	public List<String> buscarNomes() {
		List<String> nomes = new ArrayList<>();
		System.out.println("Chamou o metodo de buscar nomes");
		
		return nomes;
	}

	public void deletarDados() {
		System.out.println("Chamou o delete do UserRepository");
	//	userRepository.deleteById(1L);
	}
	
	public void inserirDados(User user) {
	//	userRepository.save(user);
	}
	
}
