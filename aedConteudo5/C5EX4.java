package aedConteudo5;

import java.util.Scanner;

public class C5EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double distancia, x1, y1, x2, y2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o X do primeiro Ponto: ");
		x1 = teclado.nextDouble();
		System.out.println("Insira o Y do primeiro Ponto: ");
		y1 = teclado.nextDouble();
		System.out.println("Insira o X do segundo Ponto: ");
		x2 = teclado.nextDouble();
		System.out.println("Insira o Y do segundo Ponto: ");
		y2 = teclado.nextDouble();
		distancia = Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
		System.out.println("A distancia é: "+distancia);
		teclado.close();
		
		
		
	}

}
