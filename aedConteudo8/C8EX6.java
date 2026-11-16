package aedConteudo8;

import java.util.Scanner;

public class C8EX6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aux, numero, soma = 0, divisiveis3 = 0;
		for (aux = 1; aux <= 10; aux++) {
			System.out.println("insira um numero:");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Par.");
			} else if (numero % 2 > 0) {
				System.out.println("Impar.");
				System.out.println();
			}
			if (numero % 4 == 0) {
				soma = soma + numero;
			}
			if (numero % 3 == 0) {
				divisiveis3++;
			}
		}
		System.out.println(
				"Soma dos Numeros divisíveis por 4: " + soma + "\n" + "Quantidade de divisíveis por 3: " + divisiveis3);
		teclado.close();
	}
}
