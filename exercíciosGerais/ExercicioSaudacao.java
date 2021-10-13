package PortalDigitalHouseExercicios.Dominio;

import java.util.Scanner;

public class ExercicioSaudacao {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu nome");
		String nome = teclado.next();

		System.out.println("Olá, " + nome);

	}

}
