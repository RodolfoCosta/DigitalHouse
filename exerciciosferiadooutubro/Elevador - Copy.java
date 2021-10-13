package exerciciosferiadooutubro;

/**
 * 
 * @author Rodolfo => Esse exerc�cio ir� simular a movimenta��o de passageiros e
 *         um elevador
 *
 */

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int pessoalNoElevador;

	public Elevador() {
		super();
	}

	public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int pessoalNoElevador) {
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.pessoalNoElevador = pessoalNoElevador;
	}

	public void inicializa(int capacidade, int andares) {
		this.capacidadeElevador = capacidade;
		this.totalAndares = andares;
	}

	public void entra(int novoPassageiro) {
		if (pessoalNoElevador <= capacidadeElevador) {
			novoPassageiro++;
		} else {
			System.out.println("Lotado");
		}

	}

	public void sai(int genteDentroDoElevador) {
		if (pessoalNoElevador > 0) {
			genteDentroDoElevador--;
		}

	}

	public void sobe(int subirAndar) {
		if (andarAtual < totalAndares) {
			andarAtual++;
		} else {
			System.out.println("J� est� no �ltimo andar");
		}
	}

	public void desce(int descerAndar) {
		if (andarAtual > 0) {
			andarAtual--;
		} else if (andarAtual == 0) {
			System.out.println("Elevador est� no t�rreo");
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getPessoalNoElevador() {
		return pessoalNoElevador;
	}

	public void setPessoalNoElevador(int pessoalNoElevador) {
		this.pessoalNoElevador = pessoalNoElevador;
	}

}
