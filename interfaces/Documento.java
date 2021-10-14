package interfaces;

public class Documento implements Imprimivel {

	private String nome;
	private String tipo;

	public Documento() {
		super();
	}

	public Documento(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um documento do word " + this.nome + " " + this.tipo);
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
