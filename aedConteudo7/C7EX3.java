package aedConteudo7;

import java.util.Scanner;

public class C7EX3 {

	public static void main(String[] args) {
		double dias, imposto, multa;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o valor do imposto: ");
		imposto = teclado.nextDouble();
		System.out.print("Insira a quantidade de dias de atraso: ");
		dias = teclado.nextInt();
		if (dias >= 6 && dias <= 8) {
			multa = (imposto * 2.0) / 100.0;
			System.out.print("Valor da multa: " + multa);
		} else if (dias >= 9 && dias <= 10) {
			multa = ((imposto * 10.0) / 100.0) + (dias * (imposto * 0.5) / 100.0);
			System.out.print("Valor da multa: " + multa);
		} else if (dias > 10) {
			multa = ((imposto * 150.0) / 100.0) + (dias * 1.0);
			System.out.print("Valor da multa: " + multa);
		}
		teclado.close();
	}

}
