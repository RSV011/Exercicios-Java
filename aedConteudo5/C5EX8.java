package aedConteudo5;

import java.util.Scanner;

public class C5EX8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double resultado, s, a, raio;
		System.out.println("Insira o valor de S: ");
		s = teclado.nextDouble();
		System.out.println("Insira o valor de A: ");
		a = teclado.nextDouble();
		resultado = (s * (360 / a)) / Math.PI;
		raio = Math.sqrt(resultado);
		System.out.println("Olá. Eu sou. Esse é o valor de R: "+raio);

		teclado.close();
	}
}
