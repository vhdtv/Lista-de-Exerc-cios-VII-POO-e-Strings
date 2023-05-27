package ListaVII_POOeStrings;

import java.util.Scanner;

public class nomeInvertidoMaiusculo {
	private String nome, inverteNome;
	Scanner scan = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInverteNome() {
		return inverteNome;
	}

	public void setInverteNome(String inverteNome) {
		this.inverteNome = inverteNome;
	}

	public void leNome() {
		System.out.println("Digite seu nome:");
		setNome(scan.nextLine().toUpperCase());
		
	}

	public void inverteNomeMaiusculo() {
		setInverteNome(new StringBuilder(getNome()).reverse().toString());
		System.out.println("" + getInverteNome());
	}

}