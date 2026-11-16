package aedConteudo8;

import java.util.Scanner;

public class C8EX1 {

	public static void main(String[] args) {
		double pi, area, raio;
		Scanner teclado = new Scanner(System.in);
		for (int repeticao = 1; repeticao <= 3; repeticao++) {
			System.out.print("Insira o raio: ");
			raio = teclado.nextDouble();
			pi = 3.1416;
			area = Math.pow(pi * raio, 2);
			System.out.print("Esta é a área: " + area);
			System.out.println();
		}
		teclado.close();

	}

}
