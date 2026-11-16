package aedConteudo8;

import java.util.Scanner;

public class C8EX5A {

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
			for (aux = 1; aux <= 50; aux++) {
				if (beltrano == ciclano) {
					System.out.println("insira o numero do seu candidato");
					voto = teclado.nextInt();
					switch (voto) {
					case 1:
						beltrano++;
					case 2:
						ciclano++;
					}
					System.out.println(
							"Fulano: " + fulano + "\n" + "Beltrano: " + ciclano + "\n" + "Ciclano: " + ciclano);
				} else if (fulano == ciclano) {
					System.out.println("insira o numero do seu candidato");
					voto = teclado.nextInt();
					switch (voto) {
					case 1:
						fulano++;
					case 2:
						ciclano++;
					}
					System.out.println(
							"Fulano: " + ciclano + "\n" + "Beltrano: " + beltrano + "\n" + "Ciclano: " + ciclano);
				} else if (fulano == beltrano) {
					System.out.println("insira o numero do seu candidato");
					voto = teclado.nextInt();
					switch (voto) {
					case 1:
						beltrano++;
					case 2:
						fulano++;
					}
					System.out.println(
							"Fulano: " + fulano + "\n" + "Beltrano: " + beltrano + "\n" + "Ciclano: " + ciclano);
				}
			}
			teclado.close();
		}
	}

}
