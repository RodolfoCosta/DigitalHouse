package aula1DH;

import java.util.Scanner;

public class AulaExercicios01 {

	String texto1, texto2, texto3;

	Scanner teclado = new Scanner(System.in);

	public void imprimir() {
		System.out.println("\n" + texto1 + " " + texto2 + " " + texto3);

	}

	public void exibirPrimeiraPalavra() {
		System.out.println("Digite a primeira palavra");
		texto1 = teclado.next();
	}

	public void exibirSegundaPalavra() {
		System.out.println("Digite a segunda palavra");
		texto2 = teclado.next();
	}

	public void exibirTerceiraPalavra() {
		System.out.println("Digite a terceira palavra");
		texto3 = teclado.next();
	}

}
