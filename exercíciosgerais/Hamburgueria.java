package OrientacaoAObjetoExercicios;

import java.util.Scanner;

public class Hamburgueria {

	Scanner teclado = new Scanner(System.in);
	public static double conta;
	public double total;
	public byte numero;

	{

		System.out.println("Bem vindo a hamburgueria Git Donalds" + "\n Por favor, escolha seu pedido");
		System.out.println(
				"\n1 - Hamb�rguer - R$ 10,00 \n2 - Batata frita - R$ 8,50 \nSalada - R$ 4,20 \n3 - Regrigerante - R$15,00 \n4 - Combo 1 - Hamb�rguer, batata frita e refrigerante - R$ 20,00 \n5 - Combo 2 - Hamb�rguer, salada e refrigerante - R$ 13,50");

	}

	public void exibirPedido() {

		while (true) {
			System.out.println("\nInforme o n�mero do produto desejado");
			numero = teclado.nextByte();

			switch (numero) {
			case 1:
				conta = 10;
				break;
			case 2:
				conta = 8.50;
				break;
			case 3:
				conta = 15;
				break;
			case 4:
				conta = 20;
				break;
			case 5:
				conta = 13.50;
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
			total += conta;

			System.out.println("\nDeseja algo mais? (S/N): ");
			String resposta = teclado.next();

			if (resposta.equalsIgnoreCase("N")) {
				break;
			} else {

				System.out.println("\n\"Adicionar ao pedido\"\n" + " Por favor, digite a nova op��o");
				System.out.println(
						"\n1 - Hamb�rguer - R$ 10,00 \n2 - Batata frita - R$ 8,50 \nSalada - R$ 4,20 \n3 - Regrigerante - R$15,00 \n4 - Combo 1 - Hamb�rguer, batata frita e refrigerante - R$ 20,00 \n5 - Combo 2 - Hamb�rguer, salada e refrigerante - R$ 13,50");

			}

		}
		System.out.println("O valor total do seu pedido �: R$ " + total);
		System.out.println("\n---------------------------------------------------------------------");
		System.out.println("\nObrigado pela prefer�ncia");

	}

}
