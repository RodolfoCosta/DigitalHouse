package OrientacaoAObjetoExercicios;

public class Conta {
	private String titular;
	private double saldo;

	public double depositar(double deposito) {
		saldo = saldo + deposito;
		return saldo;

	}

	public void sacar(double valor) {
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
