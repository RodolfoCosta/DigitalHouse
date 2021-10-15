package testesistema;

import java.util.List;

/**
 * Classe de negocio para realizar operacoes sobre clientes do banco
 * 
 * @author Rodolfo Lacerda
 *
 */

public class ControleDeClientes {

	// Criar lista com os clientes do banco
	public List<Cliente> clientesBanco;

	public ControleDeClientes(List<Cliente> clientesBanco) {
		this.clientesBanco = clientesBanco;
	}

	/**
	 * Pesquisar por um cliente a partir do seu id
	 * 
	 * @param idCliente
	 *            id do cliente a ser pesquisado
	 * @return caso o cliente seja localizado retorna dados do cliente do contrario
	 *         retorna null
	 */

	// Pesquisar através do id do Cliente
	public Cliente pesquisarCliente(int idCliente) {
		for (Cliente cliente : clientesBanco) {
			if (cliente.getId() == idCliente) {
				return cliente;
			}
		}

		return null;

	}

	/**
	 * Adicionar um novo cliente a lista
	 * 
	 * @param novoCliente
	 *            sao as informacoes no novo cliente que sera adicionado na lista
	 */

	public void adicionarCliente(Cliente novoCliente) {
		clientesBanco.add(novoCliente);
	}

	/**
	 * Retorna a lista de clientes do banco
	 * 
	 * @return lista com todos os clientes
	 */

	public List<Cliente> getClientesBanco() {
		return clientesBanco;
	}

}
