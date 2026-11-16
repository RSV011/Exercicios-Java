package aedConteudo5;

import java.util.Scanner;
public class C5EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double x, valFuncao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é o valor de x? ");
		x = teclado.nextDouble();
		valFuncao= (x = Math.pow(x,3)+4*x+10);
		System.out.println("Valor da Função: "+valFuncao);
		teclado.close();
		
	}

}
