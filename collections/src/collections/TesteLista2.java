package collections;

import java.util.HashSet;
import java.util.Set;

public class TesteLista2 {

	public static void main(String[] args) {

		// Implementacoes de SET
		Set objetos = new HashSet();

		objetos.add("Celular");
		objetos.add("Tablet");
		objetos.add("Celular");

		System.out.println(objetos);

		for (Object object : objetos) {
			String sTemp = (String) object;
			System.out.println(sTemp);

		}

	}
}
