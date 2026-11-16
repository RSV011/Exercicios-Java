package aedConteudo7;

import java.util.Scanner;

public class C7EX2 {

	public static void main(String[] args) {
		int notaTotal, nota1, nota2, nota3;
		String Conceito;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira a primeira nota: ");
		nota1 = teclado.nextInt();
		System.out.print("Insira a segunda nota: ");
		nota2 = teclado.nextInt();
		System.out.print("Insira a terceira nota: ");
		nota3 = teclado.nextInt();
		notaTotal = nota1 + nota2 + nota3;
		switch (notaTotal) {
		case 27, 28, 29, 30:
			Conceito = "A";
			System.out.println("Conceito: " + Conceito);
			break;
		case 24, 25, 26:
			Conceito = "B";
			System.out.println("Conceito: " + Conceito);
			break;
		case 21, 22, 23:
			Conceito = "C";
			System.out.println("Conceito: " + Conceito);
			break;
		case 15, 16, 17, 18, 19, 20:
			Conceito = "D";
			System.out.println("Conceito: " + Conceito);
			break;
		default:
			Conceito = "E";
			System.out.println("Conceito: " + Conceito);
			break;

		}
		teclado.close();

	}
}
