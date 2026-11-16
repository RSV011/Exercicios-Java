package aedConteudo5;

import java.util.Scanner;

public class C5EX12 {

	public static void main(String[] args) {
		int seg, min, horas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a duração do evento em segundos: ");
		seg = teclado.nextInt();
		horas = seg/3600;
		min = seg%3600/60;
		seg = seg%3600%60;
		System.out.println("Esta foi a duração do evento: "+horas+":"+min+":"+seg);
		teclado.close();

	}

}
