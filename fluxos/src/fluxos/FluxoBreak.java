package fluxos;

public class FluxoBreak {

	public static void main(String[] args) {

		String nome[] = { "Bianca", "Nico", "Maria", "Jos�" };
		String nomeProcurado = "Maria";

		boolean localizado = false;

		// buscarNomes: Rotulado => Facilita a busca em estruturas com muitos FOR e faz
		// a pausa (Break) em pontos espec�ficos
		buscarNomes: for (int i = 0; i < nome.length; i++) {
			if (nome[i].equals(nomeProcurado)) {
				localizado = true;
				break buscarNomes;
			}
		}
		if (localizado) {
			System.out.println("Nome localizado");
		} else {
			System.out.println("Nome n�o localizado");
		}

	}

}
