package aedConteudo8;

import java.util.Scanner;

public class C8EX2 {

	public static void main(String[] args) {
		int faltas, nota;
		Scanner teclado = new Scanner(System.in);
		for (int repeticao = 1; repeticao <= 50; repeticao++) {
			System.out.print("Insira a Nota do aluno: ");
			nota = teclado.nextInt();
			System.out.print("Insira a quantidade de faltas do aluno: ");
			faltas = teclado.nextInt();
			if (faltas <= 16 && nota >= 65) {
				System.out.println("ALUNO APROVADO");
			} else if (faltas > 16 || nota < 65) {
				System.out.println("ALUNO REPROVADO");
			}
			if (nota == -1)
				break;
		}
		teclado.close();
	}

}
