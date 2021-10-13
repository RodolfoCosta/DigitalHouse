package loopsArrays;

/**
 * 
 * @author Rodolfo => Esse programa soma os 50 primeiros números pares
 *
 */

public class NonoExercicio {
	public static void main(String[] args) {

		int soma = 0;
		int numero = 2;

		for (int i = 1; i <= 50; i++) {
			soma += numero;
			numero += 2;

		}
		System.out.println("A soma dos 50 primeiros numeros pares é: " + soma);
	}

}
