package collections;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(456, "Robin", "Nico", "111111111-11");
		Funcionario funcionario2 = new Funcionario(567, "Sanji", "Vinsmok", "222222222-22");

		// Map <Chave, Valor>
		Map<String, Funcionario> mapaFuncionarios = new HashMap<String, Funcionario>();

		// Método de adição é o put
		mapaFuncionarios.put("Caixa", funcionario1);
		mapaFuncionarios.put("Atendente", funcionario2);

		Funcionario buscaFuncionario = mapaFuncionarios.get("Caixa");
		System.out.println(buscaFuncionario.getNome());

	}

}
