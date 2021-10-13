package Delivery;

public class Bolo extends Lanche {

	String massa;
	String recheio;
	String cobertura;

	public Bolo() {
		super();
	}

	public Bolo(String massa, String recheio, String cobertura) {
		super();
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}

	public void exibirBolo() {
		System.out.println("Digite a sua opção de bolo");
		System.out.println("1 - Massa: Chocolate, Recheio: Chocolate, Cobertura: Canela (R$ 38,50)"
				+ "\n2 - Massa: Baunilha, Recheio: Doce de leita, Cobertura: Chocolate (R$ 48,50)"
				+ "\n3 - Massa: Chocolate, Recheio: Prestígio, Cobertura: Morango (R$ 50,00)");
		resposta = teclado.nextByte();

		switch (resposta) {
		case 1:
			System.out.println("Você escolheu => Massa: Chocolate, Recheio: Chocolate, Cobertura: Canela");
			conta = 38.50;
			break;
		case 2:
			System.out.println("Você escolheu => Massa: Baunilha, Recheio: Doce de leita, Cobertura: Chocolate");
			conta = 48.50;
			break;
		case 3:
			System.out.println("Você escolheu => Massa: Chocolate, Recheio: Prestígio, Cobertura: Morango");
			conta = 50.00;
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		total += conta;

	}

	@Override
	public int tempoPorKm(int valor) {
		return (valor * 10) + 10;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

}
