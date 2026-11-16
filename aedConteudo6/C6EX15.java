package aedConteudo6;

import java.util.Scanner;

public class C6EX15 {

	public static void main(String[] args) {
		String cidade;
		double valorExtra, valorFinal;
		int codigo, dias;
		double valorFixo, imposto = 0.0, precoPPV = 0.0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a cidade: ");
		cidade = teclado.nextLine();
		System.out.print("digite o código: ");
		codigo = teclado.nextInt();
		System.out.print("Digite a quantidade de dias de consumo de canais pay-per-view: ");
		dias = teclado.nextInt();
		System.out.print("Digite o valor Extra: ");
		valorExtra = teclado.nextDouble();
		if (cidade.equalsIgnoreCase("belo horizonte")) {
			imposto = 0.0;
		} else if (cidade.equalsIgnoreCase("rio de janeiro")) {
			imposto = 0.015;
		} else if (cidade.equalsIgnoreCase("são de paulo")) {
			imposto = 0.01;
		} else {
			imposto = 0.02;
		}
		if (codigo == 1) {
			if (dias < 30) {
				precoPPV = dias * 1.2;
			} else if (dias > 30) {
				precoPPV = 65.0;
			}
			valorFixo = 65.00;
			valorFinal = valorFixo + precoPPV + imposto + valorExtra;
			System.out.println(valorFinal);
		} else if (codigo == 2) {
			precoPPV = dias * 2.1;
			valorFixo = 104.00;
			imposto = ((valorFixo + precoPPV + valorExtra) * imposto);
			valorFinal = valorFixo + precoPPV + imposto + valorExtra;
			System.out.println(valorFinal);
		} else if (codigo == 3) {
			valorFixo = 137.00;
			imposto = ((valorFixo + precoPPV + valorExtra) * imposto);
			valorFinal = valorFixo + imposto + valorExtra;
			System.out.println(valorFinal);
		}
		teclado.close();
	}
}