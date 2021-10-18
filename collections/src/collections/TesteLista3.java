package collections;

import java.util.HashSet;
import java.util.Set;

public class TesteLista3 {

	public static void main(String[] args) {

		Set<String> animaisDoZoo = new HashSet<String>();
		animaisDoZoo.add("Girafa");
		animaisDoZoo.add("Macaco");
		animaisDoZoo.add("Leão");
		animaisDoZoo.add("Tartaruga");

		// Mostra um blocão
		System.out.println(animaisDoZoo);

		System.out.println("\n=======================================\n");

		// MOstra um de cada vez
		for (String animal : animaisDoZoo) {
			System.out.println(animal);
		}

		System.out.println("\n=======================================\n");

		// Total do tamanho
		System.out.println("Tamanho lista: " + animaisDoZoo.size());
		System.out.println("Existe o animal? " + animaisDoZoo.contains("Macaco"));
		System.out.println("Removendo animal... " + animaisDoZoo.remove("Leão"));
		System.out.println(animaisDoZoo);
		
		
	}

}
