package br.com.projetopizzaria.pizzariaDH.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetopizzaria.pizzariaDH.data.vo.v1.ClienteVO;
import br.com.projetopizzaria.pizzariaDH.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Cliente Endpoint")
@RestController
@RequestMapping("api/cliente/v1")
public class ClienteController {

	@Autowired
	ClienteService service;

//	@CrossOrigin("localhost:8080")
//	@Operation(summary = "Listar todas os clientes")
//	@GetMapping(produces = { "application/json", "application/xml" })
//	public ResponseEntity<CollectionModel<ClienteVO>> exibirClientes(
//			@RequestParam(value = "page", defaultValue = "0") int page,
//			@RequestParam(value = "limit", defaultValue = "10") int limit,
//			@RequestParam(value = "direction", defaultValue = "asc") String direction) {

//		List<ClienteVO> clientesVO = service.buscarTodos();
//		clientesVO.stream().forEach(
//				p -> p.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(p.getKey())).withSelfRel()));
//		return ResponseEntity.ok(CollectionModel.of(clientesVO));
//	}

	@CrossOrigin({ "localhost:8080" })
	@Operation(summary = "Lista cliente através do Id")
	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
	public ClienteVO exibirClientePorId(@PathVariable("id") Long idCliente) {
		ClienteVO clienteVO = service.buscarPorId(idCliente);
		clienteVO.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(idCliente)).withSelfRel());
		return clienteVO;
	}

//	@CrossOrigin("localhost:8080")
//	@Operation(summary = "Listar clientes por nome")
//	@GetMapping(value = "/buscarPorNome/{nome}", produces = { "application/json", "application/xml" })
//
//	public ResponseEntity<CollectionModel<ClienteVO>> exibirPessoasPorNome(
//
//			@PathVariable("nome") String nome, @RequestParam(value = "page", defaultValue = "0") int page,
//			@RequestParam(value = "limit", defaultValue = "10") int limit,
//			@RequestParam(value = "direction", defaultValue = "asc") String direction) {

//		List<ClienteVO> clienteVO = service.buscarClientePorNome(nome);
//		clienteVO.stream().forEach(
//				p -> p.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(p.getKey())).withSelfRel()));
//		return ResponseEntity.ok(CollectionModel.of(clienteVO));
//	}

	@CrossOrigin("localhost:8080")
	@Operation(summary = "Insere dados de um novo cliente")
	@PostMapping(produces = { "application/json", "application/xml" }, consumes = { "application/json",
			"application/xml" })
	public ClienteVO inserirCliente(@RequestBody ClienteVO cliente) {
		ClienteVO clienteVO = service.inserir(cliente);
		clienteVO.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(clienteVO.getKey())).withSelfRel());
		return clienteVO;
	}

	@CrossOrigin("localhost:8080")
	@Operation(summary = "Atualiza dados de um cliente")
	@PutMapping(produces = { "application/json", "application/xml" }, consumes = { "application/json",
			"application/xml" })
	public ClienteVO atualizarPessoa(@RequestBody ClienteVO cliente) {
		ClienteVO clienteVO = service.atualizar(cliente);
		clienteVO.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(clienteVO.getKey())).withSelfRel());
		return clienteVO;
	}

	@CrossOrigin("localhost:8080")
	@Operation(summary = "Inativa clientes com o id especificado")
	@PatchMapping(value = "/{id}", produces = { "application/json", "application/xml" })
	public ClienteVO inativarClientes(@PathVariable("id") Long id) {

		ClienteVO clienteVO = service.inativarCliente(id);
		clienteVO.add(linkTo(methodOn(ClienteController.class).exibirClientePorId(id)).withSelfRel());
		return clienteVO;

	}

	@CrossOrigin("localhost:8080")
	@Operation(summary = "Remove dados de um cliente através do Id")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluirCliente(@PathVariable("id") Long idCliente) {
		service.deletar(idCliente);
		return ResponseEntity.ok().build();
	}

}
