package collections;

import java.util.HashMap;
import java.util.Map;

public class TesteLista4 {

	public static void main(String[] args) {

		double capacidadeCombustivel = 50.6;
		double capacidadeAgua = 35.5;
		double capacidadeOleo = 6.7;

		Map<String, Double> reservatorio = new HashMap<String, Double>();

		reservatorio.put("Gasolina", capacidadeCombustivel);
		reservatorio.put("Agua", capacidadeAgua);
		reservatorio.put("Oleo", capacidadeOleo);
		System.out.println(reservatorio);

		double valores = reservatorio.get("Oleo");
		reservatorio.remove("Agua");
		System.out.println(valores);
		System.out.println(reservatorio);

	}

}
