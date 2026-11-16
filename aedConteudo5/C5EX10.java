package aedConteudo5;

import java.util.Scanner;

public class C5EX10 {

	public static void main(String[] args) {
		int n, n1, n2, n3, n4, n5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número de 5 digitos: ");
		n = teclado.nextInt();
		n1=n/10000;
		n2=n/1000%10;
		n3=n%1000/100;
		n4=n%100/10;
		n5=n%10;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		teclado.close();
		}

}
