package equals;

/**
 * Esse exercício aborda a utilização do metodo equals
 * 
 * @author Rodolfo
 *
 */

public class Coca {

	protected int tamanho;
	protected double preco;

	public Coca() {
		super();
	}

	public Coca(int tamanho, double preco) {
		super();
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
