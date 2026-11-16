package aedConteudo5;

import java.util.Scanner;

public class C5EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double reta, A, B, C, X, Y, distancia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor de A da reta: ");
		A = teclado.nextDouble();
		System.out.println("Insira o valor de B da reta: ");
		B = teclado.nextDouble();
		System.out.println("Insira o valor de C da reta: ");
		C = teclado.nextDouble();
		System.out.println("Insira o valor de X do Ponto: ");
		X = teclado.nextDouble();
		System.out.println("Insira o valor de Y do Ponto: ");
		Y = teclado.nextDouble();
		reta = (A*X)+(B*Y)+C;
		distancia = reta/Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
		System.out.println("Esta é a distancia: "+distancia);
		teclado.close();
		
	}

}
