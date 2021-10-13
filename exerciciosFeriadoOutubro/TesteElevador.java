package exerciciosFeriadoOutubro;

public class TesteElevador {

	public static void main(String[] args) {

		Elevador elevador = new Elevador();

		elevador.inicializa(10, 1);
		elevador.entra(10);
		elevador.sai(5);
		elevador.sobe(1);
		elevador.desce(1);
		elevador.sai(1);
		elevador.desce(1);

	}

}
