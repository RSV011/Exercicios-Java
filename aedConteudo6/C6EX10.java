package aedConteudo6;

import java.util.Scanner;

public class C6EX10 {

	public static void main(String[] args) {
		double capital, taxa, dias, rendimento, imposto, vR;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o capital aplicado: ");
		capital = teclado.nextDouble();
		System.out.print("Insira o numero de dias em que ficou aplicado: ");
		dias = teclado.nextDouble();
		System.out.print("Insira a taxa diária: ");
		taxa = teclado.nextDouble();
		rendimento = taxa*(capital*dias)/100;
		imposto = ((15*rendimento)/100) ;
		vR = ((capital+rendimento)-imposto)-10;
		System.out.print("Valor Resgatado: "+vR);
		teclado.close();
	}

}
