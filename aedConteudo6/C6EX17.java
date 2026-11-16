package aedConteudo6;

import java.util.Scanner;

public class C6EX17 {

	public static void main(String[] args) {
		String tecnico, superior, experiencia, criativo, liderar, sozinhoEquipe, autodidata, remuneracao, escritorio;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Voce tem curso técnico de programação?: ");
		tecnico = teclado.nextLine();
		System.out.print("Você tem curso superior de programação?: ");
		superior = teclado.nextLine();
		System.out.print("Você tem menos de 3 anos de exeperiência em programação?: ");
		experiencia = teclado.nextLine();
		System.out.print("Você se considera uma pessoa criativa?: ");
		criativo = teclado.nextLine();
		System.out.print("Você prefere liderar a ser liderado?: ");
		liderar = teclado.nextLine();
		System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?: ");
		sozinhoEquipe = teclado.nextLine();
		System.out.print("Você é audidata?: ");
		autodidata = teclado.nextLine();
		System.out.print("Você aceita uma remuneração inicial de R$1500,00?: ");
		remuneracao = teclado.nextLine();
		System.out.print("Você só aceitaria trabalhar em escritos da empresa dentro da grande BH?: ");
		escritorio = teclado.nextLine();

		if (tecnico.equalsIgnoreCase("v") && experiencia.equalsIgnoreCase("v")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (tecnico.equalsIgnoreCase("v") && experiencia.equalsIgnoreCase("v") && superior.equalsIgnoreCase("f")
				|| superior.equalsIgnoreCase("v")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (tecnico.equalsIgnoreCase("v") && experiencia.equalsIgnoreCase("v")
				&& experiencia.equalsIgnoreCase("f") || experiencia.equalsIgnoreCase("v")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (criativo.equalsIgnoreCase("v")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (liderar.equalsIgnoreCase("v")) {
			remuneracao = "f";
		} else if (sozinhoEquipe.equalsIgnoreCase("f")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (autodidata.equalsIgnoreCase("v")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (liderar.equalsIgnoreCase("v") && remuneracao.equalsIgnoreCase("f")) {
			System.out.println("Está apta a trabalhar na empresa");
		} else if (escritorio.equalsIgnoreCase("f")){
			System.out.println("Está apta a trabalhar na empresa");
		}teclado.close();

	}

}
