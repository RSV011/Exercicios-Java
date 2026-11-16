package aedConteudo5;

import java.util.Scanner;

public class C5EX9 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira nota do aluno: ");
		nota1 = teclado.nextDouble();
		System.out.println("Insira a segunda nota do aluno: ");
		nota2 = teclado.nextDouble();
		System.out.println("Insira a terceira nota do aluno: ");
		nota3 = teclado.nextDouble();
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		System.out.println("Esta é a média: "+media);
		teclado.close();
		

	}

}
