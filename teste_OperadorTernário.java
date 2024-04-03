package curso03_04;

import java.util.Scanner;

public class teste_OperadorTernário {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Informe sua idade: ");
			int idade = ler.nextInt();
			
			String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
			System.out.println(mensagem); // Imprime "Maior de idade"
		}
	}

}
