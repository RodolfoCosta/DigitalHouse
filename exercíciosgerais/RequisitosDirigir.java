package PortalDigitalHouseExercicios.Dominio;

import java.util.Scanner;

public class RequisitosDirigir {
	public static void main(String[] args) {

		String resultado = null;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a sua idade");
		int idade = teclado.nextInt();

		@SuppressWarnings("resource")
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Você possui carteira de habilitação? Digite 'Sim' ou 'Não'");
		String habilitacao = teclado2.next();

		if (idade >= 18 && habilitacao.equalsIgnoreCase("Sim")) {
			resultado = "Você pode dirigir";
		} else if (idade >= 18 && habilitacao.equalsIgnoreCase("Não")) {
			resultado = "Você precisa de habilitação para dirigir";
		} else if (idade < 18) {
			resultado = "Você não tem idade para dirigir";
		}
		System.out.println(resultado);
		System.out.println("-----------------------------------------");
		System.out.println("\nPROGRAMA ENCERRADO");

	}

}
