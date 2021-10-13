package PortalDigitalHouseExercicios.Dominio;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = teclado.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo.\n Hoje é final de semana!");
			break;
		case 2:
			System.out.println("Segunda-feira.\n Hoje é dia de semana!");
			break;
		case 3:
			System.out.println("Terça-feira.\n Hoje é dia de semana!");
			break;
		case 4:
			System.out.println("Quarta-feita.\n Hoje é dia de semana!");
			break;
		case 5:
			System.out.println("Quinta-feira.\n Hoje é dia de semana!");
			break;
		case 6:
			System.out.println("Sexta-feira.\n Hoje é dia de semana!");
			break;
		case 7:
			System.out.println("Sábado.\n Hoje é final de semana!");
			break;

		default:
			System.out.println("NÚMERO INVÁLIDO");
			break;
		}
		System.out.println("------------------------------------------------------");
		System.out.println("\nPROGRAMA ENCERRADO");
	}

}
