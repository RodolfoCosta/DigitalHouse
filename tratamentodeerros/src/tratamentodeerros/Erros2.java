package tratamentodeerros;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Erros2 {

	public static void main(String[] args) {

		try {
			new java.io.FileReader("auladeerro.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalAccessError e) {
			e.printStackTrace();
		}

	}

}
