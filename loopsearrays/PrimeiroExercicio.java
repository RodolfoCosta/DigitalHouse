package loopsearrays;

/**
 * 
 * @author Rodolfo => Esse exerc�cio ir� fazer a evolu��o salarial de um
 *         funcion�rio considerando um valor pr�-fixado de aumento
 *
 */

public class PrimeiroExercicio {
	public static void main(String[] args) {

		double aumento = 1.5;
		double salario = 1015;
		double novoSalario;
		int ano = 1996;

		do {

			novoSalario = (salario + (salario * aumento) / 100);
			aumento = aumento * 2;
			ano++;

		} while (ano <= 2021);
		System.out.println(novoSalario);

	}

}
