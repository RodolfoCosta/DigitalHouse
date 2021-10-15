package teste;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import testesistema.Cliente;
import testesistema.ControleDeClientes;

public class GerenciadorClientesTest1 {

	@Test
	public void testePesquisarCliente() {

		Cliente cliente1 = new Cliente(1, "Nico Robin", "robin@teste.com.br", true, 1234);
		Cliente cliente2 = new Cliente(2, "Nami", "nami@teste.com.br", true, 5678);

		// Inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente1);
		clientesDoBanco.add(cliente2);

		ControleDeClientes gerClientes = new ControleDeClientes(clientesDoBanco);
		Cliente cliente = gerClientes.pesquisarCliente(1);

		// Notacao de teste unitario
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("robin@teste.com.br"));

	}

}
