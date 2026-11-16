package aedConteudo8;

import java.util.Scanner;

public class C8EX7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media, idades = 0;
		int aux, idade, idade30 = 0, acima30 = 0, abaixo12 = 0, idade12 = 0, rep = 0;
		for (aux = 1; aux <= 5; aux++) {
			System.out.print("Insira o nome do aluno: ");
			teclado.nextLine();
			System.out.print("Insira a idade do aluno: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			rep++;
			idades += idade;
			if (idade > 30) {
				idade30 += idade;
				acima30++;
			} else if (idade <= 12) {
				idade12 += idade;
				abaixo12++;
			}
		}media = idades / rep;
		System.out.println("alunos acima dos trinta anos: " + acima30);
		System.out.println("alunos de menos de 12 anos: " + abaixo12);
		System.out.println("media" + media);
		teclado.close();
	}
}