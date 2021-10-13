package exerciciosferiadooutubro;

public class VeiculoAVenda {

	protected String tipo;
	protected String ano;
	protected double precoDeVenda;

	public VeiculoAVenda() {
		super();
	}

	public VeiculoAVenda(String tipo, String ano, double precoDeVenda) {
		super();
		this.tipo = tipo;
		this.ano = ano;
		this.precoDeVenda = precoDeVenda;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

}
