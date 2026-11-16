package aedConteudo8;

import java.util.Scanner;

public class C8EX3 {

	public static void main(String[] args) {
		int reprovados = 0, aprovados = 0, faltas, nota;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 50; aux++) {
			System.out.print("Insira a Nota do aluno: ");
			nota = teclado.nextInt();
			System.out.print("Insira a quantidade de faltas do aluno: ");
			faltas = teclado.nextInt();
			if (faltas <= 16 && nota >= 65) {
				System.out.println("ALUNO APROVADO");
				aprovados++;
			} else if (faltas > 16 || nota < 65) {
				System.out.println("ALUNO REPROVADO");
				reprovados++;
			}
			if (nota == -1)
				break;
		}
		System.out.println("Alunos Aprovados: " + aprovados);
		System.out.println("Alunos Reprovados: " + reprovados);
		teclado.close();
	}

}
