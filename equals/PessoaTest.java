package equals;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Sanji", 231155141);
		Pessoa pessoa2 = new Pessoa("Zoro", 231155141);

		System.out.println(pessoa1.equals(pessoa2));
		System.out.println("=========================");
		System.out.println(pessoa1.equals(pessoa2));
		System.out.println("=========================");

	}

}
