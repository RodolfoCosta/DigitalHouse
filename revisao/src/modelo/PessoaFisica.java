package modelo;

public class PessoaFisica extends PessoaHeranca {

	private String cpf;

	// sobrescrita de m�todo
	@Override
	public void validaEmail(String email) {
		// TODO Auto-generated method stub
	}

	public void validaTelefone(String telefone, String nome) {
		if (telefone.equals(getTelefone()) && nome.equals(getNome())) {
			System.out.println("Telefone v�lido");
		}
	}

	@Override
	public void validarDocumentos(String documento) {
		// TODO Auto-generated method stub

	}

}
