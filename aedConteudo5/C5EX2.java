package aedConteudo5;

import java.util.Scanner;

public class C5EX2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double area, raio, volume, pi ;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é o raio? ");
		raio = teclado.nextDouble();
		pi = 3.1416;
		area = (4*pi*Math.pow(raio, 2));
		volume = ((4.0/3.0)*(pi*Math.pow(raio, 3)));
		System.out.println("Area: "+area);
		System.out.println("Volume: "+volume);
		teclado.close();
		
	}

}
