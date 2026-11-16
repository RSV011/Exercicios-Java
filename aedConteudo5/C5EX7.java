package aedConteudo5;

import java.util.Scanner;

public class C5EX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f, x;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor de X: ");
		x = teclado.nextDouble();
		f = Math.sqrt(Math.pow(((x/4.0)+1),2)+(1.0/5.0)*x);
		System.out.println("F(x) = "+f);
		teclado.close();

	}

}
