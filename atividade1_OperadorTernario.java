package curso03_04;

import java.util.Scanner;

public class atividade1_OperadorTernario {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4,media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(mensagem);
		

	}

}
