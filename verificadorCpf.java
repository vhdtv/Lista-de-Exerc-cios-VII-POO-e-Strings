package ListaVII_POOeStrings;
import java.util.Scanner;
public class verificadorCpf {
	private String cpf;
	Scanner scan = new Scanner(System.in);
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void validaCpf() {
		int condicao = 1;
		do {
		System.out.println("Digite o seu CPF no seguinte padrão: xxx.xxx.xxx-xx "
				+ "(inclua os pontos e barra)");
		setCpf(scan.nextLine());
		if(getCpf().charAt(3) == '.' && getCpf().charAt(7) == '.' && getCpf().charAt(11) == '-'  ) { 
			System.out.println("Cadastro de CPF realizado com sucesso!");
			condicao = 2;
		}
		else
			System.out.println("Cadastro inválido digite novamente:");
		}while(condicao ==1);
		
	}
}
