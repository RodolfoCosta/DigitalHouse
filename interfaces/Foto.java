package interfaces;

public class Foto implements Imprimivel {

	private String nome;
	private String tipo;

	public Foto() {
		super();
	}

	public Foto(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public void imprimir() {
		System.out.println("Sou uma selfie " + this.nome + " " + this.tipo);
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
