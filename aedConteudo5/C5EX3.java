package aedConteudo5;

import java.util.Scanner;

public class C5EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double salario, impRenda , liquido;
		int dependentes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o seu salário: ");
		salario = teclado.nextDouble();
		System.out.println("Insira o número de dependentes: ");
		dependentes = teclado.nextInt();
		liquido = salario-(dependentes*60.00);
		impRenda = (liquido*15)/100;
		System.out.println("Imposto de renda: R$"+impRenda);
		teclado.close();
		
		
		
	}

}
