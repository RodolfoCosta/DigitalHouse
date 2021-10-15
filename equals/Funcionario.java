package equals;

public class Funcionario {

	protected String nome;
	protected int numeroDeRegistro;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, int numeroDeRegistro) {
		super();
		this.nome = nome;
		this.numeroDeRegistro = numeroDeRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

}
