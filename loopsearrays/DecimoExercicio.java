package loopsearrays;

import java.util.Scanner;

public class DecimoExercicio {

	public static void main(String[] args) {

		int numero;
		int resultado = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Digite um n�mero maior que 1");
			numero = teclado.nextInt();

		} while (numero <= 1);

		for (int i = 2; i <= numero / 2; i++) {
			if (numero % i == 0) {
				resultado++;
				break;
			}

		}

		if (resultado == 0) {
			System.out.println("O n�mero " + numero + " � primo");
		} else {
			System.out.println("O n�mero " + numero + " n�o � primo");
		}
		teclado.close();
	}

}
