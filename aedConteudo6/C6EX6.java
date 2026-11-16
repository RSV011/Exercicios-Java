package aedConteudo6;

import java.util.Scanner;

public class C6EX6 {

	public static void main(String[] args) {
		double delta, a, b, c, raiz1, raiz2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = teclado.nextDouble();
		delta = (Math.pow(b, 2))-(4*a*c);
		if (delta == 0) {
			raiz1 = (-b +Math.sqrt(delta))/(2*a);
			System.out.println("Raiz= "+raiz1);
		}else if (delta > 0) {
			raiz1 = (-b +Math.sqrt(delta))/(2*a);
			raiz2 = (-b -Math.sqrt(delta))/(2*a);
			System.out.println("Primeira Raiz: "+raiz1+" Segunda Raiz: "+raiz2);
		}else if (delta < 0){
			System.out.println("Não há Raizes. ");
		}
		
		teclado.close();
	}

}
