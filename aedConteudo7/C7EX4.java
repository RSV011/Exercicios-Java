package aedConteudo7;

import java.util.Scanner;

public class C7EX4 {

	public static void main(String[] args) {
		String equipe;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o nome da equipe de futebol desejada: ");
		equipe = teclado.nextLine();
		if (equipe.equalsIgnoreCase("América") || equipe.equalsIgnoreCase("Atlético")
				|| equipe.equalsIgnoreCase("Cruzeiro") || equipe.equalsIgnoreCase("Villa Nova")) {
			System.out.println("Esta equipe pertence ao estado de Minas Gerais");
		} else if (equipe.equalsIgnoreCase("Botafogo") || equipe.equalsIgnoreCase("Flamengo")
				|| equipe.equalsIgnoreCase("Fluminense") || equipe.equalsIgnoreCase("Vasco")) {
			System.out.println("Esta equipe pertence ao estado de Rio de Janeiro");
		} else if (equipe.equalsIgnoreCase("Corinthians") || equipe.equalsIgnoreCase("Palmeiras")
				|| equipe.equalsIgnoreCase("Santos") || equipe.equalsIgnoreCase("São Paulo")) {
			System.out.println("Esta equipe pertence ao estado de São Paulo");
		} else if (equipe.equalsIgnoreCase("Grêmio") || equipe.equalsIgnoreCase("internacional")
				|| equipe.equalsIgnoreCase("Juventude")) {
			System.out.println("Esta equipe pertence ao estado de Rio Grande do Sul");
		} else if (equipe.equalsIgnoreCase("Náutico") || equipe.equalsIgnoreCase("Santa Cruz")
				|| equipe.equalsIgnoreCase("Sport")) {
			System.out.println("Esta equipe pertence ao estado de Pernambuco");
		}
		teclado.close();

	}

}
