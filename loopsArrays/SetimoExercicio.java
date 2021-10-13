package loopsArrays;

/**
 * 
 * @author Rodolfo => Esse programa irá apresentar a série de FIBONACCI até o
 *         oitavo termo A séria de FIBONACCIA é a impressão de um número somado
 *         ao anterior, exemplo: 0, 1, 1, 2, 3, 5, 8
 *
 */

public class SetimoExercicio {
	public static void main(String[] args) {

		int numero1 = 1;
		int numero2 = 0;

		System.out.println(numero2);
		System.out.println(numero1);

		for (int i = 0; i < 6; i++) {
			numero1 += numero2;
			numero2 = numero1 - numero2;
			System.out.println(numero1);

		}

	}

}
