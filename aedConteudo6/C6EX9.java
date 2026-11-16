package aedConteudo6;

import java.util.Scanner;

public class C6EX9 {

	public static void main(String[] args) {
		String Genero;
		double altura, pesoIdeal;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Você é homem ou mulher: ");
		Genero = teclado.nextLine();
		System.out.print("Qual é a sua altura: ");
		altura = teclado.nextDouble();
		if (Genero.equalsIgnoreCase("homem")) {
			pesoIdeal=72.7*altura-58;
			System.out.println("Este é seu peso ideal: "+pesoIdeal);	
		}else if (Genero.equalsIgnoreCase("mulher")) {
			pesoIdeal=62.1*altura-44.7;
			System.out.println("Este é seu peso ideal: "+pesoIdeal);
		}teclado.close();
	}

}
