package aedConteudo6;

import java.util.Scanner;

public class C6EX2 {

	public static void main(String[] args) {
		
		double poluente, multa;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual é a quantidade de poluentes: ");
		poluente = teclado.nextDouble();
		if (poluente <= 1500) {
			multa= 0;
			System.out.println("este é o valor da multa: "+multa);
		}else if (poluente > 1500 && poluente <=3000){
			multa= 3000.00;
			System.out.println("este é o valor da multa: "+multa);
		}else if (poluente > 3000.00){
			multa= 5000.0*poluente;
			System.out.println("este é o valor da multa: "+multa);
		}
			
		
		teclado.close();

	}

}
