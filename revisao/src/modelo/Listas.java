package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listas {

	public static void main(String[] args) {

		List mala = new ArrayList<>();
		mala.add("camisa");
		mala.add("calça");
		mala.add("meia");

		for (int i = 0; i < mala.size(); i++) {
			System.out.println(mala.get(i));
		}

		System.out.println("\n==============================================\n");

		for (Object object : mala) {
			String item = (String) object;
			System.out.println(item);
		}

		System.out.println("\n==============================================\n");
		System.out.println(mala.contains("meia"));
		System.out.println("\n==============================================\n");

		Set<String> bolsa = new HashSet<String>();
		bolsa.add("carteira");
		bolsa.add("chave");
		bolsa.add("celular");

		for (String item : bolsa) {
			System.out.println(item);
		}
		System.out.println("\n==============================================\n");

		Map<Integer, String> carteira = new HashMap<Integer, String>();
		carteira.put(1, "cartão do banco");
		carteira.put(2, "CNH");
		carteira.put(3, "dinheiro");
		System.out.println(carteira.get(1));
	}

}
