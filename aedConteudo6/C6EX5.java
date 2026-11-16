package aedConteudo6;

import java.util.Scanner;

public class C6EX5 {

	public static void main(String[] args) {
		double numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("insira um numero: ");
		numero = teclado.nextDouble();
		if (numero%5== 0 && numero%7==0) {
			System.out.println("Este número é divisível por 5 e 7. ");
		}else if (numero%5 >= 0 || numero%7 >= 0) {
			System.out.println("Este numero não é divisível por 5 ou 7. ");
		}teclado.close();

	}

}