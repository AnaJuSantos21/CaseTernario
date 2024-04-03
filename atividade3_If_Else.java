package curso03_04;

import java.util.Scanner;

public class atividade3_If_Else {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario,tempo, bonus1,bonus2;
		System.out.println("Informe seu salário: ");
		salario = ler.nextDouble();
		
		System.out.println("Informe seu tempo trabalhando na empresa: ");
		tempo = ler.nextDouble();		
		bonus1 = (salario*0.05);
		bonus2 = (salario*0.07);
		
		if (tempo <= 3) {
			System.out.println("Seu bônus é: " + bonus1);
		}
			
			else {
				System.out.println("Seu bônus é: " + bonus2);
			}
		
		
		
		

	}

}
