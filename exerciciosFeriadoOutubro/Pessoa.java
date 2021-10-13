package exerciciosFeriadoOutubro;

/**
 * 
 * @author Rodolfo => Esse exercício tem o objetivo de apresentar dados de uma
 *         pessoa
 *
 */

public class Pessoa {

	private String nome;
	private int dataNascimento;
	private float altura;
	private int dia;
	private int mes;
	private int ano;

	private int diaHoje = 13;
	private int mesHoje = 10;
	private int anoHoje = 2021;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, float altura, int dia, int mes, int ano) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int calcularIdade(int ano) {
		return ano = anoHoje - this.getAno();
	}

	public void imprimir() {
		System.out.println("------------------------------------");
		System.out.println("Seus dados pessois:\n" + "Nome: " + this.nome + "  Altura: " + this.altura + "  Idade: "
				+ this.calcularIdade(ano));
		System.out.println("\nData de nascimento: " + this.dia + "/" + this.mes + "/" + this.ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDiaHoje() {
		return diaHoje;
	}

	public void setDiaHoje(int diaHoje) {
		this.diaHoje = diaHoje;
	}

	public int getMesHoje() {
		return mesHoje;
	}

	public void setMesHoje(int mesHoje) {
		this.mesHoje = mesHoje;
	}

	public int getAnoHoje() {
		return anoHoje;
	}

	public void setAnoHoje(int anoHoje) {
		this.anoHoje = anoHoje;
	}

}
