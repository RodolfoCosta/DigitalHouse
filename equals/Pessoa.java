package equals;

/**
 * 
 * @author Rodolfo => Exercício para testar o operador equals
 *
 */

public class Pessoa {

	protected String nome;
	protected int RG;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int rG) {
		super();
		this.nome = nome;
		RG = rG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

}
