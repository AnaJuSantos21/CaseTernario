package curso03_04;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Informe o dia da semana de 1 a 7: ");
			int dia = ler.nextInt();
			
			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
				
			default:
				System.out.println("Dia inválido");
				
			}
		}

	}

}
