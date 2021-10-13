package Delivery;

public class Sanduiche extends Lanche {

	private String[] ingredientes;
	private String sanduiche;

	public Sanduiche() {
		super();
	}

	public Sanduiche(String[] ingredientes) {
		super();
		this.ingredientes = ingredientes;
	}

	public void exibirSanduiches() {
		System.out.println("1 - Tomate  (R$ 8,50)" + "\n2 - Alface  (R$ 10,00)" + "\n3 - Pimentão  (R$ 12,20)"
				+ "\n4 - Cebola (R$ 3,50)" + "\n5 - Mostarda (R$ 2,20)" + "\n6 - Ketchup  (R$ 2,30)"
				+ "\n7 - Pimenta  (R$ 2,80)" + "\n8 - Azeite  (R$ 3,00)" + "\n9 - Parmesão  (R$ 15,00)"
				+ "\n10 - Picles  (R$ 14,20");

		System.out.println("Digite o número para sua opção de molho/acompanhamento\n");
		resposta = teclado.nextByte();

		switch (resposta) {
		case 1:
			System.out.println("Você escolheu um sanduiche com tomate");
			conta = 8.50;
			break;
		case 2:
			System.out.println("Você escolheu um sanduiche com alface");
			conta = 10.0;
			break;
		case 3:
			System.out.println("Você escolheu um sanduiche com pimentão");
			conta = 12.20;
			break;
		case 4:
			System.out.println("Você escolheu um sanduiche com cebola");
			conta = 3.50;
			break;
		case 5:
			System.out.println("Você escolheu um sanduiche com mostarda");
			conta = 2.20;
			break;
		case 6:
			System.out.println("Você escolheu um sanduiche com ketchup");
			conta = 2.30;
			break;
		case 7:
			System.out.println("Você escolheu um sanduiche com pimenta");
			conta = 2.80;
			break;
		case 8:
			System.out.println("Você escolheu um sanduiche com azeite");
			conta = 3.0;
			break;
		case 9:
			System.out.println("Você escolheu um sanduiche com parmesão");
			conta = 15.0;
			break;
		case 10:
			System.out.println("Você escolheu um sanduiche com picles");
			conta = 14.20;
			break;

		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		total += conta;

	}

	@Override
	public int tempoPorKm(int valor) {
		return (valor * 10) + 15;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(String sanduiche) {
		this.sanduiche = sanduiche;
	}

	public static double getConta() {
		return conta;
	}

	public static void setConta(double conta) {
		Sanduiche.conta = conta;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
