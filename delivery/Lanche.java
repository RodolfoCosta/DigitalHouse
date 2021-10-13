package delivery;

import java.util.Scanner;

/**
 * 
 * @author Rodolfo => Esse sistema irá simular um sistema simples de delivery
 *
 */

public abstract class Lanche {

	protected static double conta;
	protected double total;
	protected byte resposta;

	Scanner teclado = new Scanner(System.in);

	private double preco;
	private int tempo;
	protected int km;

	public Lanche() {
		super();
	}

	public Lanche(double preco, int tempo, int km) {
		super();
		this.preco = preco;
		this.tempo = tempo;
		this.km = km;
	}

	static {
		System.out.println("                      --- DH Lanches ---                                   ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Bem vindo ao delivery DH Lanches" + "\nPor favor, escolha seu pedido");
		System.out.println("\n                   =========================");
		System.out.println("                  |     1 - Sanduiche       |");
		System.out.println("                  |     2 - Massas          |");
		System.out.println("                  |     3 - Bolo            |");
		System.out.println("                   =========================\n");
	}

	public double definirPreco(double preco) {
		for (int i = 0; i <= 10; i++) {
			preco += preco;
		}
		return preco;
	}

	public abstract int tempoPorKm(int valor);

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public static double getConta() {
		return conta;
	}

	public static void setConta(double conta) {
		Lanche.conta = conta;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public byte getResposta() {
		return resposta;
	}

	public void setResposta(byte resposta) {
		this.resposta = resposta;
	}

}
