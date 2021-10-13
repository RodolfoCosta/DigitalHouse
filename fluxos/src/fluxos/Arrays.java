package fluxos;

public class Arrays {

	public static void main(String[] args) {

		// array de uma dimensão = Vetor
		int[] notas;
		int notas2[] = new int[100];

		int[] valores = { 9, 6, 5, 7, 8 };
		int valores2[] = { 9, 6, 5, 7, 8 };

		// array de duas dimensões ou mais = Matriz

		int[][] numero = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] numero2 = new int[2][4];

		// Preenche os dados
		for (int i = 0; i < notas2.length; i++) {
			notas2[i] = i;

		}

		// Imprimi os dados
		for (int i = 0; i < notas2.length; i++) {
			System.out.println(notas2[i]);

		}

		System.out.println("\n=======================================\n");

		for (int linha = 0; linha < numero2.length; linha++) {
			for (int coluna = 0; coluna < numero2.length; coluna++) {
				numero2[linha][coluna] = coluna + 1;
			}
		}

		for (int linha = 0; linha < numero2.length; linha++) {
			for (int coluna = 0; coluna < numero2.length; coluna++) {
				System.out.println(numero2[linha][coluna]);
			}
		}

	}

}
