package loopsearrays;

/**
 * @author Rodolfo  => Esse programa faz a sequ�ncia positiva (fatorial) de um n�mero inteiro e positivo
 */

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String[] args) {

		int numero;
		int constante = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro e positivo");
		numero = teclado.nextInt();

		System.out.println(numero);

		do {
			System.out.println(numero + "!");
			System.out.println(constante);
			numero += 1;
		} while (numero <= 100);
		teclado.close();
	}

}
