package aedConteudo6;

import java.util.Scanner;

public class C6EX11 {

	public static void main(String[] args) {
		String equipe1, equipe2;
		int pontos1, pontos2, sets1, sets2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual é a primeira equipe? ");
		equipe1 = teclado.nextLine();
		System.out.print("Qual é a segunda equipe? ");
		equipe2 = teclado.nextLine();
		System.out.print("Quantos sets fez a primeira equipe? ");
		sets1 = teclado.nextInt();
		System.out.print("Quantos sets fez a segunda equipe? ");
		sets2 = teclado.nextInt();
		if (sets1 == 3 && sets2 < 2) {
			pontos1 = 3;
			System.out.print("Equipe 1: "+equipe1);
			System.out.println();
			System.out.println("Sets: "+sets1);
			System.out.println("Pontos: "+pontos1);
			System.out.println();
		}else if (sets1 == 3 && sets2 == 2) {
			pontos1 = 2;
			System.out.print("Equipe 1: "+equipe1);
			System.out.println();
			System.out.println("Sets: "+sets1);
			System.out.println("Pontos: "+pontos1);
			System.out.println();
		}else if (sets1 == 2) {
			pontos1 = 1;
			System.out.print("Equipe 1: "+equipe1);
			System.out.println();
			System.out.println("Sets: "+sets1);
			System.out.println("Pontos: "+pontos1);
			System.out.println();
		}else if(sets1 < 2) {
			pontos1 = 0;
			System.out.print("Equipe 1: "+equipe1);
			System.out.println();
			System.out.println("Sets: "+sets1);
			System.out.println("Pontos: "+pontos1);
			System.out.println();
			}
			if (sets2 == 3 && sets1 < 2) {
			pontos2 = 3;
			System.out.print("Equipe 1: "+equipe2);
			System.out.println();
			System.out.println("Sets: "+sets2);
			System.out.println("Pontos: "+pontos2);
		}else if (sets2 == 3 && sets1 == 2) {
			pontos2 = 2;
			System.out.print("Equipe 1: "+equipe2);
			System.out.println();
			System.out.println("Sets: "+sets2);
			System.out.println("Pontos: "+pontos2);
		}else if (sets2 == 2) {
			pontos2 = 1;
			System.out.print("Equipe 1: "+equipe2);
			System.out.println();
			System.out.println("Sets: "+sets2);
			System.out.println("Pontos: "+pontos2);
		}else if(sets2 < 2) {
			pontos2 = 0;
			System.out.print("Equipe 1: "+equipe2);
			System.out.println();
			System.out.println("Sets: "+sets2);
			System.out.println("Pontos: "+pontos2);
		}teclado.close();
		System.out.println();
	}

}
