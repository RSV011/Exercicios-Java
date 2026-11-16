package aedConteudo6;

import java.util.Scanner;

public class C6EX3 {

	public static void main(String[] args) {
		double vendas, salario;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual é a quantidade de poluentes: ");
		vendas = teclado.nextDouble();
		salario = 240.00;
		if (vendas <=1000.00) {
			System.out.println("Salário =R$"+salario);
		}else if (vendas > 1000.00 && vendas <=10000.00) {
			salario= (salario+(10*vendas/100));
			System.out.println("Salário =R$"+salario);
		}else if (vendas > 10000.00) {
			salario= salario+1000.00;
			System.out.println("Salário =R$"+salario);
		}
		teclado.close();
	}
	
}
