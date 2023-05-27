package ListaVII_POOeStrings;

import java.util.Scanner;

public class comparadorDeStrings {
	private String stringUm, stringDois;
	Scanner scan = new Scanner(System.in);

	public String getStringUm() {
		return stringUm;
	}

	public void setStringUm(String stringUm) {
		this.stringUm = stringUm;
	}

	public String getStringDois() {
		return stringDois;
	}

	public void setStringDois(String stringDois) {
		this.stringDois = stringDois;
	}

	public void leStrings() {
		System.out.println("Digite as duas strings que deseja comparar:");
		setStringUm(scan.nextLine());
		setStringDois(scan.nextLine());
		System.out.printf("String 1: %s\nString 2: %s\n", getStringUm(), getStringDois());
		scan.close();
	}

	public void comparaTamanhoStrings() {
		System.out.printf("Tamanho string 1: %s\nTamanho string 2: %s\n", getStringUm().length(),
				getStringDois().length());
		if (getStringUm().length() != getStringDois().length())
			System.out.println("As duas strings são de tamanhos diferentes.");
		else
			System.out.println("As duas strings são de tamanhos iguais.");
		if (getStringUm().equals(getStringDois()))
			System.out.println("As duas strings possuem conteúdo igual.");
		else
			System.out.println("As duas strings possuem conteúdo diferente.");

	}
}