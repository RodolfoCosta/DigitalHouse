package modelo;

public class PessoaFisica extends PessoaHeranca {

	private String cpf;

	// sobrescrita de método
	@Override
	public void validaEmail(String email) {
		// TODO Auto-generated method stub
	}

	public void validaTelefone(String telefone, String nome) {
		if (telefone.equals(getTelefone()) && nome.equals(getNome())) {
			System.out.println("Telefone válido");
		}
	}

	@Override
	public void validarDocumentos(String documento) {
		// TODO Auto-generated method stub

	}

}
