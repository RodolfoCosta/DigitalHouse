package Delivery;

public class Massa extends Lanche {

	private String molho;

	public Massa() {
		super();
	}

	public Massa(String molho) {
		super();
		this.molho = molho;
	}

	public void exibirMassa() {
		System.out.println("Escolha seu tipo de massa");
		System.out.println("1 - Macarrão  (R$ 18,50)" + "\n2 - Pizza  (R$ 30,00)" + "\n3 - Lasanha  (R$ 22,50)");
		resposta = teclado.nextByte();

		switch (resposta) {
		case 1:
			System.out.println("Você escolheu macarrão");
			conta = 18.50;
			break;
		case 2:
			System.out.println("Você escolheu pizza");
			conta = 30.0;
			break;
		case 3:
			System.out.println("Você escolheu lasanha");
			conta = 22.50;
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		total += conta;
	}

	@Override
	public int tempoPorKm(int valor) {
		return (valor * 10) + 30;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

}
