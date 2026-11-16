package aedConteudo4;

import javax.swing.JOptionPane;

public class C4EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ",
		"Exercicio 4", 
		JOptionPane.QUESTION_MESSAGE);
String segundonome = JOptionPane.showInputDialog(null, "Digite seu Segundo nome: ",
		"Exercicio 4", 
		JOptionPane.QUESTION_MESSAGE);
String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ",
		"Exercicio 4", 
		JOptionPane.QUESTION_MESSAGE);
String Idade = JOptionPane.showInputDialog(null, "Digite sua Idade: ",
		"Exercicio 4", 
		JOptionPane.QUESTION_MESSAGE);
	System.out.println(sobrenome+", "+nome+segundonome);
	System.out.println("Idade: "+Idade+"anos");
	}

}
