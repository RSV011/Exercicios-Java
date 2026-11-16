package aedConteudo8;

import java.util.Scanner;

public class C8EX4 {

	public static void main(String[] args) {
		String nome;
		int menorDeIdade = 0, maiorDeIdade = 0, idade;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 05; aux++) {
			System.out.println("Insira o Nome do aluno: ");
			nome = teclado.nextLine();
			System.out.println("Insira a idade do aluno: ");
			idade = teclado.nextInt();
			if (idade <= 18) {
				menorDeIdade++;
				teclado.nextLine();
			}if (idade > 18) {
				maiorDeIdade++;
				teclado.nextLine();
			}else if (nome.equalsIgnoreCase("Break"))
				break;
			
		}
		System.out.println("18 ou menos: " + menorDeIdade);
		System.out.println("maior de 18: " + maiorDeIdade);
		teclado.close();
	}

}
