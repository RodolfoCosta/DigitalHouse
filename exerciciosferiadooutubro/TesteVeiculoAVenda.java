package exerciciosferiadooutubro;

public class TesteVeiculoAVenda {
	public static void main(String[] args) {

		VeiculoAVenda v1 = new VeiculoAVenda("N�o foi inicializado com padr�o", "", 1122);
		AutomovelAVenda v2 = new AutomovelAVenda("", "", 123);
		MotocicletaAVenda v3 = new MotocicletaAVenda("", "", 456);

		System.out.println(v1.getTipo());
		System.out.println(v2.getTipo());
		System.out.println(v3.getTipo());

	}

}
