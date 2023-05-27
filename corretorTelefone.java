package ListaVII_POOeStrings;

import java.util.Scanner;

public class corretorTelefone {
	Scanner scan = new Scanner(System.in);
	private String numeroTelefone, telefoneCorrigido, telefoneFormatado;

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getTelefoneCorrigido() {
		telefoneCorrigido = "9" + getNumeroTelefone();
		return telefoneCorrigido;
	}

	public String getTelefoneFormatado() {
		telefoneFormatado = getTelefoneCorrigido().substring(0, 5) + "-" + telefoneCorrigido.substring(5, 9);
		return telefoneFormatado;
	}

	public void corretorDeDigitoTelefone() {
		System.out.println("Digite o número de telefone que deseja verificar (no formato 98718-5340).");
		setNumeroTelefone(scan.nextLine().replaceAll("[^0-9]", ""));

		if (getNumeroTelefone().length() == 8) {
			System.out.println("Telefone possui 8 dígitos. Vou acrescentar o dígito '9' na frente.");
			System.out.println("Telefone corrigido sem formatação: " + getTelefoneCorrigido());
			System.out.println("Telefone corrigido com formatação: " + getTelefoneFormatado());
		} else {
			System.out.println("Telefone já está correto ou possui formato inválido.");
		}
	}

	public static void main(String[] args) {
		corretorTelefone corretor = new corretorTelefone();
		corretor.corretorDeDigitoTelefone();
	}
}
