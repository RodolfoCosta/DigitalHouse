package Delivery;

import java.util.Scanner;

public class TesteDelivery {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Sanduiche sanduiche = new Sanduiche();
		Massa massa = new Massa();
		Bolo bolo = new Bolo();

		System.out.println("Digite o número do produto desejado");
		byte numero = teclado.nextByte();

		if (numero == 1) {
			sanduiche.exibirSanduiches();
			System.out.println("Qual a distância em km de sua residência até o nosso restaurante?");
			byte resposta = teclado.nextByte();

			System.out.println("O tempo de espera será de: " + sanduiche.tempoPorKm(resposta) + " minutos"
					+ "\nO preço do produto(lanche) será de: RS " + sanduiche.getTotal());
		} else if (numero == 2) {
			massa.exibirMassa();
			System.out.println("Qual a distância em km de sua residência até o nosso restaurante?");
			byte resposta = teclado.nextByte();

			System.out.println("O tempo de espera será de: " + massa.tempoPorKm(resposta) + " minutos"
					+ "\nO preço do produto(lanche) será de: RS " + massa.getTotal());
		} else if (numero == 2) {

		} else if (numero == 3) {
			bolo.exibirBolo();
			System.out.println("Qual a distância em km de sua residência até o nosso restaurante?");
			byte resposta = teclado.nextByte();

			System.out.println("O tempo de espera será de: " + bolo.tempoPorKm(resposta) + " minutos"
					+ "\nO preço do produto(lanche) será de: RS " + bolo.getTotal());
		} else if (numero == 2) {
		}
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("\nOBRIGADO PELA PREFERÊNCIA");
		teclado.close();

	}

}