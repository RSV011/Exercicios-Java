package aedConteudo4;

import java.util.Scanner;

public class C4EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linha;
		Scanner arquivo = new Scanner(
			C4EX5.class.getResourceAsStream("Fixa.txt"));
		linha = arquivo.nextLine();
		System.out.println(linha);
		System.out.println();
		linha = arquivo.nextLine();
		System.out.println(linha);
		linha = arquivo.nextLine();
		System.out.println(linha);
		linha = arquivo.nextLine();
		System.out.println(linha);
		linha = arquivo.nextLine();
		System.out.println(linha);
		linha = arquivo.nextLine();
		System.out.println(linha);
		System.out.println();
		linha = arquivo.nextLine();
		System.out.println(linha);
		linha = arquivo.nextLine();
		System.out.println(linha);
		arquivo.close();
		
	}

}
