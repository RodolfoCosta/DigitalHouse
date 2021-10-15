package equals;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTeste {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario funcionario1 = new Funcionario("Luffy", 1);
		Funcionario funcionario2 = new Funcionario("Chopper", 2);
		Funcionario funcionario3 = new Funcionario("Nami", 3);
		Funcionario funcionario4 = new Funcionario("Ace", 4);

		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);

		Funcionario funcionario5 = new Funcionario("Marco", 3);

		if (funcionarios.contains(funcionario5)) {
			System.out.println("Está na lista");
		} else {
			System.out.println("Não está na lista");
		}

	}

}
