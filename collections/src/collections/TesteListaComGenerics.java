package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteListaComGenerics {

	public static void main(String[] args) {

		// Implementação de List / ArrayList

		Cliente cliente1 = new Cliente(1, "Robin", "Nico", "111111111-11");
		Cliente cliente2 = new Cliente(2, "Sanji", "Vinsmok", "222222222-22");

		Funcionario funcionario1 = new Funcionario(123, "Chopper", "Aniki", "333333333-33");

		// Essa implementação é com generics porque tem o sinal <>
		List<Cliente> lista1 = new ArrayList<Cliente>();

		lista1.add(cliente1);
		lista1.add(cliente2);

		for (Cliente cliente : lista1) {
			System.out.println(cliente.getNome());
		}

		Set<String> objetos = new HashSet<String>();
		objetos.add("Celular");
		objetos.add("Tablet");
		objetos.add("Celular");
		// objetos.add(123); Não permite adicionar outro tipo de dado

		for (String string : objetos) {
			System.out.println(string);
		}
	}

}
