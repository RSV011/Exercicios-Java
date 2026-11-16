package aedConteudo6;

import java.util.Scanner;

public class C6EX12
{

	public static void main(String[] args) {
		double caixas, caixasPreco, custoTotal, galpao, aluguel;
		int bolas, bolasDefeito, meses;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira a Produção de bolas: ");
		bolas = teclado.nextInt();
		System.out.print("Insira a quantidade de bolas com defeito: ");
		bolasDefeito = teclado.nextInt();
		System.out.print("Insira o preço das caixas de papelão: ");
		caixasPreco = teclado.nextDouble();
		System.out.print("Insira o aluguel mensal dos galpões: ");
		aluguel = teclado.nextDouble();
		System.out.print("Insira a quantidade de meses para acopa: ");
		meses = teclado.nextInt();
		bolas -= bolasDefeito;
		caixas = (bolas / 10) + (bolas % 10);
		caixasPreco *= caixas;
		galpao = (caixas / 850) + (caixas % 850);
		aluguel *= galpao;
		aluguel *= meses;
		custoTotal = aluguel + caixasPreco;
		System.out.println("Custototal: " + custoTotal);
		teclado.close();

	}

}
