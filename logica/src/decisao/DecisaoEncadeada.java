package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
public static void main(String[] args) {
	
	String disciplina = JOptionPane.showInputDialog("Disciplina:").toUpperCase();
	
	short faltas = Short.parseShort(JOptionPane.showInputDialog ("Faltas"));
	if (faltas>20) {
		System.out.println("Infelizmente você foi reprovado por falta!");
	}else {

	float nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Nota1"));
	float nota2 = Float.parseFloat(JOptionPane.showInputDialog ("Nota2"));
	float media = ((nota1 + nota2)/2);
	System.out.println("Media:"+ media);
	}
	if (media>=6 && faltas<20) {
		System.out.println("Parabéns! Você foi aprovado" + disciplina);
	}else if (media<4 || faltas>=20) {
		System.out.println("Infelizmente você foi reprovado!");
	}else {
		System.out.println("Você terá mais uma chance!");
	}
	}







}
	
	
	
	
	
	
	
	
	


