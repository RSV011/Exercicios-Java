package aedConteudo3;

import java.util.Scanner;

public class CalculaFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// funcao :calcular o fatorial de um numero
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		long numero = teclado.nextLong();
		long fatorial = 1L;
		for(long contador = 2;contador<= numero; contador++) {
			fatorial = fatorial * contador;
		}
		System.out.println("fatorial = " + fatorial);
		teclado.close();
	}
}
