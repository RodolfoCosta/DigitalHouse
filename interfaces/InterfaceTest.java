package interfaces;

public class InterfaceTest {

	public static void main(String[] args) {

		Contrato contrato1 = new Contrato("Compra de ve�culo", "PDF");
		Foto foto1 = new Foto("Familiar", "C�mera");
		Documento documento1 = new Documento("Escolar", "Word");

		contrato1.imprimir();
		foto1.imprimir();
		documento1.imprimir();

	}

}
