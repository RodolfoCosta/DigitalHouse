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
		System.out.println("Voc� possui carteira de habilita��o? Digite 'Sim' ou 'N�o'");
		String habilitacao = teclado2.next();

		if (idade >= 18 && habilitacao.equalsIgnoreCase("Sim")) {
			resultado = "Voc� pode dirigir";
		} else if (idade >= 18 && habilitacao.equalsIgnoreCase("N�o")) {
			resultado = "Voc� precisa de habilita��o para dirigir";
		} else if (idade < 18) {
			resultado = "Voc� n�o tem idade para dirigir";
		}
		System.out.println(resultado);
		System.out.println("-----------------------------------------");
		System.out.println("\nPROGRAMA ENCERRADO");

	}

}
