package aedConteudo6;

import java.util.Scanner;

public class C6EX13 {

	public static void main(String[] args) {
		int horaIni, horaFim, minutoIni, minutoFim, opHora, opMinuto;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a Hora do Inicio: ");
		horaIni = teclado.nextInt();
		System.out.print("Digite os Minutos do Inicio: ");
		minutoIni = teclado.nextInt();
		System.out.print("Digite a Hora do Fim: ");
		horaFim = teclado.nextInt();
		System.out.print("Digite os Minutos do Fim: ");
		minutoFim = teclado.nextInt();
		opHora = horaFim - horaIni;
		opMinuto = minutoFim - minutoIni;
		System.out.println("O jogo durou " + opHora + " horas e " + opMinuto + " minutos");
		 
		teclado.close();
	}
}
