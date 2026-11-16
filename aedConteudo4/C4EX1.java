package aedConteudo4;

import java.util.Scanner;

public class C4EX1 {

	public static void main(String[] args) {
		String nome, sobreNome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome, e sobrenome: ");
		nome = teclado.nextLine();
		System.out.println("Informe seu ultimo nome: ");
		sobreNome = teclado.nextLine();
		System.out.println("Informe sua idade: ");
		idade = teclado.nextInt();
		System.out.println();
		System.out.println(sobreNome+", "+nome);
		System.out.println("Idade: "+idade+"anos");
		teclado.close();
		
	}

}
