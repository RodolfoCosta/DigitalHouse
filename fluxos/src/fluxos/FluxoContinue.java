package fluxos;

public class FluxoContinue {

	public static void main(String[] args) {

		String nome[] = { "Maria", "José", "Antonio", "Lucas", "José" };
		String nomeProcurado = "José";
		int cont = 0;

		buscarNomes: for (int i = 0; i < nome.length; i++) {
			if (!nome[i].equals(nomeProcurado)) {
				continue buscarNomes;
			}
			cont++;
		}
		System.out.println("O nome " + nomeProcurado + " apareceu " + cont + " vezes");
	}
}
