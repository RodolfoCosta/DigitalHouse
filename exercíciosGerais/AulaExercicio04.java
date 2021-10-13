package aula1DH;

import java.util.Scanner;

public class AulaExercicio04 {

	String nome;
	Scanner teclado = new Scanner(System.in);

	public void exibirComFor() {

		System.out.println("Digite seu nome:");
		nome = teclado.next();

		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " - " + nome + "\n");
		}

	}

	public void exibirComWhile() {
		int i = 1;

		System.out.println("Digite seu nome:");
		nome = teclado.next();

		while (i <= 100) {
			System.out.println(i + " - " + nome + "\n");
			i++;
		}

	}

	public void exibirComDoWhile() {
		int i = 1;
		
		System.out.println("Digite seu nome:");
		nome = teclado.next();

		do {
			System.out.println(i + " - " + nome + "\n");
			i++;
		} while (i <= 100);

	}

}
