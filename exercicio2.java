package curso03_04;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Informe o dia da semana: ");
			String dia = ler.next();
			
			switch (dia) {
			case "Domingo":
				System.out.println("Dia 1");
				break;
			case "Segunda":
				System.out.println("Dia 2");
				break;
			case "Terça":
				System.out.println("Dia 3");
				break;
			case "Quarta":
				System.out.println("Dia 4");
				break;
			case "Quinta":
				System.out.println("Dia 5");
				break;
			case "Sexta":
				System.out.println("Dia 6");
				break;
			case "Sábado":
				System.out.println("Dia 7");
				break;
				
			default:
				System.out.println("Dia inválido");
				
			}
		}

	}


	}
