package equals;

public class CocaTeste {

	public static void main(String[] args) {

		Coca coca1 = new Coca(2, 3.50);
		Coca coca2 = new Coca(2, 4.50);

		System.out.println(coca1.equals(coca2));
		System.out.println("==========================================");

	}

}
