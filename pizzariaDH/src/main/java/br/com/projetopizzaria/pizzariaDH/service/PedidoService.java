package br.com.projetopizzaria.pizzariaDH.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopizzaria.pizzariaDH.adapter.DozerAdapter;
import br.com.projetopizzaria.pizzariaDH.data.entity.Pedido;
import br.com.projetopizzaria.pizzariaDH.data.vo.v1.PedidoVO;
import br.com.projetopizzaria.pizzariaDH.exception.ResourceNotFoundException;
import br.com.projetopizzaria.pizzariaDH.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository repository;

	public PedidoVO inserir(PedidoVO pedidoVO) {
		var entity = DozerAdapter.parseObject(pedidoVO, Pedido.class);
		var vo = DozerAdapter.parseObject(repository.save(entity), PedidoVO.class);
		return vo;
	}

//	public List<ClienteVO> buscarTodos() {
//		var list = repository.findAll();
//		return list.map(this::converteParaClienteVO);
//	}

	public PedidoVO buscarPorId(Long idPedidoVO) {
		var entity = repository.findById(idPedidoVO)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		return DozerAdapter.parseObject(entity, PedidoVO.class);
	}

//	public List<ClienteVO> buscarClientePorNome(String nome) {
//		List<Cliente> list = repository.buscarClientePorNome(nome);
//		return list.map(this::converteParaClienteVO);
//
//	}

//	public PedidoVO atualizar(PedidoVO pedidoVO) {
//		var entity = repository.findById(pedidoVO.getKey())
//				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
//		entity.setSabor(pedidoVO.getSabor());
//
//		var vo = DozerAdapter.parseObject(repository.save(entity), PedidoVO.class);
//		return vo;
//	}

	@Transactional
	public PedidoVO inativarPedido(Long id) {
		repository.inativarPedido(id);
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		return DozerAdapter.parseObject(entity, PedidoVO.class);
	}

	public void deletar(Long idPedidoVO) {
		var entity = repository.findById(idPedidoVO)
				.orElseThrow(() -> new ResourceNotFoundException("Não foram encontrados registros com esse Id"));
		repository.delete(entity);
	}

}