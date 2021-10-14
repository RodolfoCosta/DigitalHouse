package interfaces;

public class Contrato implements Imprimivel {

	private String nome;
	private String tipo;

	public Contrato(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	public Contrato() {
		super();
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um contrato muito legal " + this.nome + " " + this.tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
