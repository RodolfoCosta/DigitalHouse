package estruturasderepeticao;

import java.util.Scanner;

public class BreakAndContinue {

	Scanner teclado = new Scanner(System.in);

	public void checarNumero() {

		int validador = 1;

		while (validador <= 3) {
			System.out.println(" ");
			System.out.println("=============================================");
			System.out.println("Checar numeral (" + validador + " de 3 utiliza��es)");
			System.out.println("Digite um n�mero = ");
			int numeroDigital = teclado.nextInt();

			if (numeroDigital == 1) {
				System.out.println("C�digo 01 (Abracadabra) identificado");
				System.out.println("Execu��o interrompida");
				validador++;
				break;
			} else if (numeroDigital == 2) {
				System.out.println("C�digo 02 (Reboot) identificado");
				System.out.println("Execu��o reiniciada");
				validador++;
				validador--;
				continue;
			} else {
				System.out.println("Erro! Numeral n�o identificado. Por favor, tente novamente.");
			}
			validador++;
		}

	}

	// Exemplo 02 - Usando doWhile (Cubo de divis�es)
	public void usarCuboDivisor() {
		int contadorDeTentativas = 1;
		do {
			System.out.println(" ");
			System.out.println("================");
			System.out.println("CUBO DIVISOR (" + contadorDeTentativas + " de 5 tentativas)");
			System.out.println("ATEN��O: Para utilizar o sistema, ");
			System.out.println("o segundo numero precisa ser maior do que 0 (zero)");
			System.out.println("Insira o primeiro valor = ");
			float inputA = teclado.nextFloat();

			System.out.println("Agora, insira o segundo valor = ");
			float inputB = teclado.nextFloat();

			// Autenticador de denominador
			if (inputB == 0) {
				// Este comando "Continue" implica na reinicializa��o do cubo divisor
				contadorDeTentativas++;
				continue;
			}

			float resultado = inputA / inputB;
			System.out.println("Resultado = ");
			System.out.println(inputA + " / " + inputB + " = " + resultado);
			contadorDeTentativas++;
		} while (contadorDeTentativas <= 5);
	}

	// Exemplo 03 - Usando Switch (Mixer de cores de luzes)
	public void mudarCorDasLuzes() {
		int tentativasDeUso = 1;

		do {
			System.out.println(" ");
			System.out.println("===============");
			System.out.println("Mixer de cores de ilumina��o (" + tentativasDeUso + " de 5 utiliza��es)");
			System.out.println("Por favor, digite um nome de colora��o = ");
			String corCapturada = teclado.next();
			switch (corCapturada) {
			case "Verde":
				System.out.println("Cor da l�mpada RGB = " + corCapturada);
				break;
			case "Azul":
				System.out.println("Cor da l�mpada RGB = " + corCapturada);
				break;
			case "Branco":
				System.out.println("Cor da l�mpada RGB = " + corCapturada);
				break;
			case "Amarelo":
				System.out.println("Cor da l�mpada RGB = " + corCapturada);
				break;
			case "Roxo":
				System.out.println("Cor da l�mpada RGB = " + corCapturada);
				break;
			default:
				System.out.println("Erro! Cor ou informa��o");
				System.out.println("n�o encontrada no sistema!");
				System.out.println("Por favor, tente novamente.");
			}
			tentativasDeUso++;
		} while (tentativasDeUso <= 5);
	}

}
