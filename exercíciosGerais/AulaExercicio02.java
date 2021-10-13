package aula1DH;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AulaExercicio02 {

	float nota1, nota2, nota3;
	float media;
	Scanner teclado = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");

	public void imprimir() {
		if (media >= 7) {
			System.out.println("\nNota: " + media + "\nAluno aprovado");
		} else {
			System.out.println("\nNota: " + media + "\nAluno reprovado");
		}

	}

	public void exibirNotas() {

		System.out.println("Digite suas notas\n");

		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextFloat();

		System.out.println("\nDigite a segunda nota: ");
		nota2 = teclado.nextFloat();

		System.out.println("\nDigite a terceira nota: ");
		nota3 = teclado.nextFloat();

		media = ((nota1 + nota2 + nota3) / 3);
		df.format(media);
	}

}
