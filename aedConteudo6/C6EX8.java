package aedConteudo6;

import java.util.Scanner;

public class C6EX8 {

	public static void main(String[] args) {
		String nome;
		double altura, min, max;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Insira sua altura: ");
		altura = teclado.nextDouble();
		min= Math.pow(altura, 2)*20;
		max= Math.pow(altura, 2)*25;
		System.out.print(nome+"este é o seu peso minimo : "+min+" Peso maximo: "+max);
		teclado.close();
	}

}
