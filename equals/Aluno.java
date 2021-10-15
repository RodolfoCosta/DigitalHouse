package equals;

public class Aluno {

	protected String nome;
	protected int numeroDeAluno;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int numeroDeAluno) {
		super();
		this.nome = nome;
		this.numeroDeAluno = numeroDeAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeAluno() {
		return numeroDeAluno;
	}

	public void setNumeroDeAluno(int numeroDeAluno) {
		this.numeroDeAluno = numeroDeAluno;
	}

}
