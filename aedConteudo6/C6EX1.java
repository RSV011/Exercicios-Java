package aedConteudo6;

import java.util.Scanner;

public class C6EX1 {
	public static void main(String[] args) {
		double x, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		x = teclado.nextDouble();
		if (x == 4) {
			x = 0.0;
			System.out.println("X igual a 4 = " + x);
		} else if (x < 4) {
			resultado = (5 * x + 3) / (Math.sqrt(16 - Math.pow(x, 2)));
			System.out.println("X Menor que 4 = " + resultado);
		} else if (x > 4) {
			resultado = (5 * x + 3) / (Math.sqrt(Math.pow(x, 2) - 16));
			System.out.println("X Maior que 4 = " + resultado);
		}
		teclado.close();

	}

}
