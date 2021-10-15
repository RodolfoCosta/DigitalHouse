package equals;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno1 = new Aluno("Sanji", 1);
		Aluno aluno2 = new Aluno("Zoro", 2);
		Aluno aluno3 = new Aluno("Kaido", 3);
		Aluno aluno4 = new Aluno("Big Mom", 4);

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);

		Aluno aluno5 = new Aluno("Shanks", 3);

		if (alunos.contains(aluno5)) {
			System.out.println("Está na lista");
		} else {
			System.out.println("Não está na lista");
		}

	}

}
