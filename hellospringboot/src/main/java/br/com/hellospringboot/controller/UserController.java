package br.com.hellospringboot.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import br.com.hellospringboot.entity.User;
import br.com.hellospringboot.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow(RuntimeException::new);
	}

	@PostMapping
	public ResponseEntity createUser(@RequestBody User User) throws URISyntaxException {
		User savedUser = userRepository.save(User);
		return ResponseEntity.created(new URI("/Users/" + savedUser.getUserId())).body(savedUser);
	}

	@PutMapping("/{id}")
	public ResponseEntity updateUser(@PathVariable Long id, @RequestBody User User) {
		User currentUser = userRepository.findById(id).orElseThrow(RuntimeException::new);
		currentUser.setNome(User.getNome());
		currentUser = userRepository.save(User);

		return ResponseEntity.ok(currentUser);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
