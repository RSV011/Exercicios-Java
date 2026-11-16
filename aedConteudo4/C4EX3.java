package aedConteudo4;

import java.util.*;

public class C4EX3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com o valor do poluente: ");
		int poluente = teclado.nextInt();

		double multa = 0;

		System.out.println("____________________________________________________");
		System.out.println("Quantidade de Poluente Emitido X Valor da Multa ");
		System.out.println("____________________________________________________");

		if (poluente <= 1500) {
			multa = 1000.55;
			System.out.println("Multa de R$: " + multa);
		} else if (poluente > 1500 && poluente <= 3000) {
			multa = 3550.34;
			System.out.println("Multa de R$:" + multa);
		} else if (poluente > 3000) {
			multa = 1200.21 * poluente;
			System.out.println("Multa de R$: " + multa);
		} else {
			System.out.println("Entre com algum valor de poluente!");
		}

		System.out.println("____________________________________________________");

		teclado.close();

	}

}
