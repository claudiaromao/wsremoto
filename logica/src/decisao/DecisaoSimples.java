package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
public static void main(String[] args) {
	
	String disciplina = JOptionPane.showInputDialog("Disciplina:").toUpperCase();
	float nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Nota1"));
	float nota2 = Float.parseFloat(JOptionPane.showInputDialog ("Nota2"));
	float media = ((nota1 + nota2)/2);
	System.out.println("Media:"+ media);
	if (media>=6) {
		System.out.println("Parabéns! Você foi aprovado" + disciplina);
	}
	if (media<4) {
		System.out.println("Infelizmente você foi reprovado!");
	}
	if (media<6 && media>=4) {
		System.out.println("Você terá mais uma chance!");
	
		
		
		
	}
	}
	
	
	
	
	
	
	
	
	
}

