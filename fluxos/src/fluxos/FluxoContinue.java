package fluxos;

public class FluxoContinue {

	public static void main(String[] args) {

		String nome[] = { "Maria", "Jos�", "Antonio", "Lucas", "Jos�" };
		String nomeProcurado = "Jos�";
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
