package aedConteudo6;

import java.util.Scanner;

public class C6EX4 {

	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira sua altura: ");
		altura = teclado.nextDouble();
		System.out.print("Insira seu peso: ");
		peso = teclado.nextDouble();
		imc= peso/(Math.pow(altura, 2));
		if (imc <= 18) {
			System.out.println("Você esta desnutrido. ");
		}else if (imc >18 && imc <=20) {
			System.out.println("Você esta abaixo do peso. ");
		}else if (imc >20 && imc <=25) {
			System.out.println("Você esta no peso ideal. ");
		}else if (imc >=25 && imc <27) {
			System.out.println("Você esta acima do peso. ");
		}else if (imc >=27) {
			System.out.println("Você esta obeso. ");
		}teclado.close();

	}

}
