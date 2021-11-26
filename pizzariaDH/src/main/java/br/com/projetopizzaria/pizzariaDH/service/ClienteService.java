package br.com.projetopizzaria.pizzariaDH.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopizzaria.pizzariaDH.adapter.DozerAdapter;
import br.com.projetopizzaria.pizzariaDH.data.entity.Cliente;
import br.com.projetopizzaria.pizzariaDH.data.vo.v1.ClienteVO;
import br.com.projetopizzaria.pizzariaDH.exception.ResourceNotFoundException;
import br.com.projetopizzaria.pizzariaDH.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;

	public ClienteVO inserir(ClienteVO clienteVO) {
		var entity = DozerAdapter.parseObject(clienteVO, Cliente.class);
		var vo = DozerAdapter.parseObject(repository.save(entity), ClienteVO.class);
		return vo;
	}

//	public List<ClienteVO> buscarTodos() {
//		var list = repository.findAll();
//		return list.map(this::converteParaClienteVO);
//	}

	public ClienteVO buscarPorId(Long idClienteVO) {
		var entity = repository.findById(idClienteVO)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		return DozerAdapter.parseObject(entity, ClienteVO.class);
	}

//	public List<ClienteVO> buscarClientePorNome(String nome) {
//		List<Cliente> list = repository.buscarClientePorNome(nome);
//		return list.map(this::converteParaClienteVO);
//
//	}

//	public Page<ClienteVO> buscarClientePorNome(String nome, Pageable pageable) {
//		var page = repository.buscarClientePorNome(nome, pageable);
//		return page.map(this::converteParaClienteVO);
//	}

	public ClienteVO atualizar(ClienteVO clienteVO) {
		var entity = repository.findById(clienteVO.getKey())
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		entity.setNome(clienteVO.getNome());
		entity.setEmail(clienteVO.getEmail());
		entity.setTelefone(clienteVO.getTelefone());

		var vo = DozerAdapter.parseObject(repository.save(entity), ClienteVO.class);
		return vo;
	}

	@Transactional
	public ClienteVO inativarCliente(Long id) {
		repository.inativarCliente(id);
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		return DozerAdapter.parseObject(entity, ClienteVO.class);
	}

	public void deletar(Long idClienteVO) {
		var entity = repository.findById(idClienteVO)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		repository.delete(entity);
	}

}