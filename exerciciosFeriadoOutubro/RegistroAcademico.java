package exerciciosFeriadoOutubro;

/**
 * 
 * @author Rodolfo => Esse registro tem o objetivo de apresentar os dados
 *         acadêmicos de um aluno
 *
 */

public class RegistroAcademico {

	private String nomeDoAluno;
	private int matricula;
	private String DataNAcimento;
	private boolean eBolsista;
	private int anoDeMatricula;
	private double mensalidade;

	public RegistroAcademico() {
		super();
	}

	public RegistroAcademico(String nomeDoAluno, int matricula, String dataNAcimento, boolean eBolsista,
			int anoDeMatricula, double mensalidade) {
		super();
		this.nomeDoAluno = nomeDoAluno;
		this.matricula = matricula;
		DataNAcimento = dataNAcimento;
		this.eBolsista = eBolsista;
		this.anoDeMatricula = anoDeMatricula;
		this.mensalidade = mensalidade;
	}

	public double calcularMensalidade(double mensalidade) {
		if (eBolsista) {
			return mensalidade = (mensalidade / 2);
		} else {
			return mensalidade = getMensalidade();
		}

	}

	public void mostrarRegistro() {
		System.out.println("----------------------------------------------------");
		System.out.println(
				"Nome do aluno: " + this.nomeDoAluno + "\nMatrícula: " + this.matricula + "\nData de nascimento: "
						+ this.DataNAcimento + "\nBolsista: " + this.eBolsista + "\nAno de matrícula: "
						+ this.anoDeMatricula + "\nMensalidade: " + this.calcularMensalidade(mensalidade));
	}

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataNAcimento() {
		return DataNAcimento;
	}

	public void setDataNAcimento(String dataNAcimento) {
		DataNAcimento = dataNAcimento;
	}

	public boolean iseBolsista() {
		return eBolsista;
	}

	public void seteBolsista(boolean eBolsista) {
		this.eBolsista = eBolsista;
	}

	public int getAnoDeMatricula() {
		return anoDeMatricula;
	}

	public void setAnoDeMatricula(int anoDeMatricula) {
		this.anoDeMatricula = anoDeMatricula;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

}
