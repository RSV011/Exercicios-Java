package aedConteudo5;

import java.util.Scanner;

public class C5EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double cel, kel, fah;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a quantidade desejada em Celsius: ");
		cel = teclado.nextDouble();
		kel = cel+273;
		fah = cel*1.8+32;
		System.out.println("Celsius: "+cel+" > Kelvin: "+kel+" > Fahrenheit: "+ fah);
		teclado.close();
		//Oi professor. Eu não entendi muito bem a maneira de converter usada no exercício.
		//Então eu converti do meu jeito, espero que isso não afete a minha nota do exercício.
		//Agradeço desde já, obrigado, e boa noite. 
	}

}
