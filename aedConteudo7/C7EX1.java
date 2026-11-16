package aedConteudo7;

import java.util.Scanner;

public class C7EX1 {

	public static void main(String[] args) {
		int acertos;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o nome do jogador: ");
		nome = teclado.nextLine();
		System.out.print("Insira a quantidade de jogos ganhos: ");
		acertos = teclado.nextInt();
		switch (acertos) {
		case 6, 7, 8, 9, 10:
			System.out.print("Nome: " + nome);
			System.out.print("Prêmio: Outro cartão");
			break;
		case 11:
			System.out.print("Nome: " + nome);
			System.out.print("Prêmio: R$100,00");
			break;
		case 12:
			System.out.print("Nome: " + nome);
			System.out.print("Prêmio: R$1.000,00");
			break;
		case 13:
			System.out.print("Nome: " + nome);
			System.out.print("Prêmio: R$50.000,00");
			break;
		default:
			System.out.print("Nome: " + nome);
			System.out.print("Nenhum prêmio");
		}teclado.close();

	}

}
