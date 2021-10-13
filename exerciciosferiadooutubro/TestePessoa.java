package exerciciosferiadooutubro;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Captain Eustass Kid", 1.87f, 15, 9, 1991);

		pessoa.calcularIdade(1991);
		pessoa.imprimir();

	}

}
