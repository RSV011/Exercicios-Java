package aedConteudo6;

import java.util.Scanner;

public class C6EX7 {

	public static void main(String[] args) {
		double salario, valorFixo, percent, plBruto, plLiquido, impRenda;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o salario: ");
		salario = teclado.nextDouble();
		if (salario <= 300) {
			percent= (70*salario)/100;
			valorFixo= 500;
			plBruto= valorFixo+percent;
			impRenda= (plBruto*25)/100 ;
			plLiquido= plBruto-impRenda;
			System.out.println("PL Liquido: "+plLiquido);
		}else if (salario >300 && salario <=1000) {
				percent= (50*salario)/100;
				valorFixo= 200;
				plBruto= valorFixo+percent;
				impRenda= (plBruto*25)/100 ;
				plLiquido= plBruto-impRenda;
				System.out.println("PL Liquido: "+plLiquido);
		}else if (salario >1000) {
			percent= (30*salario)/100;
			valorFixo= 0;
			plBruto= percent;
			impRenda= (plBruto*25)/100 ;
			plLiquido= plBruto-impRenda;
			System.out.println("PL Liquido: "+plLiquido);
		}teclado.close();
	}

}
