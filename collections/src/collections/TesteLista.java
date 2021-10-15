package collections;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// Sem generics <>
		List lista1 = new ArrayList();
		Cliente cliente1 = new Cliente(1, "Luffy", "D.", "333.333.333-33");
		Cliente cliente2 = new Cliente(2, "Robin", "Nico", "444.444.444-44");

		lista1.add(cliente1);
		lista1.add(cliente2);
		lista1.add(cliente1);
		lista1.add(cliente2);

		System.out.println("=======================================");
		System.out.println("Número de elementos na lista: " + lista1.size());
		System.out.println("=======================================");

		Funcionario funcionario1 = new Funcionario(123, "Nami", "Swan", "555.555.555-55");
		Funcionario funcionario2 = new Funcionario(123, "Franky", "Robot", "888.888.888-88");

		lista1.add(funcionario1);
		lista1.add(funcionario2);
		System.out.println("Número de elementos na lista: " + lista1.size());

		for (int i = 0; i < lista1.size(); i++) {
			Cliente clienteTemporario = (Cliente) lista1.get(i);
			System.out.println("Elemento: " + clienteTemporario.getNome());
		}
		System.out.println("=======================================");
	}

}
