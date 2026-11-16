package aedConteudo6;

import java.util.Scanner;

public class C6EX14 {

	public static void main(String[] args) {
		int n0, n1, n2, n3, n4;
		Scanner teclado = new Scanner(System.in);
		System.out.print(": ");
		n0 = teclado.nextInt();
		n1 = n0/1000;
		n2 = n0/100%10;
		n3 = n0/10%10;
		n4 = n0%10;
		System.out.println("Numero: "+n4+n3+n2+n1);
		teclado.close();
	}

}
