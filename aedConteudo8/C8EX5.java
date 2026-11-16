package aedConteudo8;

import java.util.Scanner;

public class C8EX5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		{
			int voto, fulano = 0, ciclano = 0, beltrano = 0, aux;
			for (aux = 1; aux <= 50; aux++) {
				System.out.println("insira o numero do seu candidato");
				voto = teclado.nextInt();
				switch (voto) {
				case 1:
					fulano++;
				case 2:
					ciclano++;
				case 3:
					beltrano++;
				}
			}
			System.out.println("Fulano: " + fulano + "\n" + "Beltrano: " + beltrano + "\n" + "Ciclano: " + ciclano);
			teclado.close();
		}

	}
}
