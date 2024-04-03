package curso03_04;

import java.util.Scanner;

public class atividade2_OperadorTernario {

	public static void main(String[] args) {
		double valor;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Informe um valor: ");
			valor = ler.nextDouble();
		}
		String mensagem = valor % 5 ==0 ? "O número inserido é multiplo de 5" : "O número inserido não é multiplo de 5";
		System.out.println(mensagem);
		
				

	}

}
