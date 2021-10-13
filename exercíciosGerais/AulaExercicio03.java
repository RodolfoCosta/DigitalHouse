package aula1DH;

import java.util.Scanner;

public class AulaExercicio03 {

	int numero;
	String texto;
	Scanner teclado = new Scanner(System.in);

	public void exibirNumeroComIF() {

		System.out.println("IfElse\n");

		System.out.println("Digite um número entre 01 e 10");
		numero = teclado.nextInt();

		if (numero == 1) {
			texto = "Um";
		} else if (numero == 2) {
			texto = "Dois";
		} else if (numero == 3) {
			texto = "Três";
		} else if (numero == 4) {
			texto = "Quatro";
		} else if (numero == 5) {
			texto = "Cinco";
		} else if (numero == 6) {
			texto = "Seis";
		} else if (numero == 7) {
			texto = "Sete";
		} else if (numero == 8) {
			texto = "Oito";
		} else if (numero == 9) {
			texto = "Nove";
		} else if (numero == 10) {
			texto = "Dez";
		} else {
			texto = "Número inválido";
		}

		System.out.println(texto);
	}

	public void exibirNumeroComSwitch() {

		System.out.println("Switch case\n");
		System.out.println("Digite um número entre 01 e 10");
		numero = teclado.nextInt();

		switch (numero) {
		case 1:
			texto = "Um";
			break;
		case 2:
			texto = "Dois";
			break;
		case 3:
			texto = "Três";
			break;
		case 4:
			texto = "Quatro";
			break;
		case 5:
			texto = "Cinco";
			break;
		case 6:
			texto = "Seis";
			break;
		case 7:
			texto = "Sete";
			break;
		case 8:
			texto = "Oito";
			break;
		case 9:
			texto = "Nove";
			break;
		case 10:
			texto = "Dez";
			break;
		default:
			texto = "Número inválido";
			break;
		}

		System.out.println(texto);
	}
}
