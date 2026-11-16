package aedConteudo5;

import java.util.Scanner;

public class C5EX11 {

	public static void main(String[] args) {
		int numCheque, agencia, banco, sequencial;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número do cheque: ");
		numCheque = teclado.nextInt();
		banco = numCheque/1000000;
		agencia = numCheque/1000%1000;
		sequencial = numCheque%1000;
		System.out.println("Banco: "+banco);
		System.out.println("Agencia: "+agencia);
		System.out.println("Sequencial: "+sequencial);
		teclado.close();
	}

}
