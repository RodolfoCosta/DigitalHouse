package PortalDigitalHouseExercicios.Dominio;

import java.util.Scanner;

public class VerificadorIdade {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a sua idade");
		int idade = teclado.nextInt();

		System.out.println((idade >= 18) ? "Você é maior de idade" : "Você é menor de idade");

	}

}
