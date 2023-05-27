package ListaVII_POOeStrings;

import java.util.Scanner;

public class numeroPorExtenso {
	private String[] unidades = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
	private String[] dezADezenove = { "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete",
			"dezoito", "dezenove" };
	private String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
			"noventa" };

	public void executar() {
		Scanner scanner = new Scanner(System.in);
		int numero = obterNumeroValido(scanner);
		String numeroExtenso = obterNumeroExtenso(numero);
		System.out.println("Número por extenso: " + numeroExtenso);
	}

	public int obterNumeroValido(Scanner scanner) {
		int numero = 0;
		boolean numeroValido = false;
		do {
			System.out.print("Digite um número de 0 a 99: ");
			if (scanner.hasNextInt()) {
				numero = scanner.nextInt();
				if (numero >= 0 && numero <= 99) {
					numeroValido = true;
				} else {
					System.out.println("Número inválido. Digite um número entre 0 e 99.");
				}
			} else {
				System.out.println("Entrada inválida. Digite um número inteiro válido.");
				scanner.next();
			}
		} while (!numeroValido);
		return numero;
	}

	private String obterNumeroExtenso(int numero) {
		if (numero < 10) {
			return unidades[numero];
		} else if (numero < 20) {
			return dezADezenove[numero - 10];
		} else {
			int unidade = numero % 10;
			int dezena = numero / 10;
			if (unidade == 0) {
				return dezenas[dezena];
			} else {
				return dezenas[dezena] + " e " + unidades[unidade];
			}
		}
	}

	public String[] getUnidades() {
		return unidades;
	}

	public void setUnidades(String[] unidades) {
		this.unidades = unidades;
	}

	public String[] getDezADezenove() {
		return dezADezenove;
	}

	public void setDezADezenove(String[] dezADezenove) {
		this.dezADezenove = dezADezenove;
	}

	public String[] getDezenas() {
		return dezenas;
	}

	public void setDezenas(String[] dezenas) {
		this.dezenas = dezenas;
	}
}
