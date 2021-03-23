package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
public static void main(String[] args) {
	
	String produto = JOptionPane.showInputDialog("Produto:");
	short qtde = Short.parseShort(JOptionPane.showInputDialog ("qtde"));
	float porcentagem = Float.parseFloat(JOptionPane.showInputDialog ("Porcentagem:"));
	float valor = Float.parseFloat(JOptionPane.showInputDialog ("Valor:"));
	float imposto = valor * (porcentagem/100);
	
	
	System.out.println("Valor com imposto:" + (valor+imposto));
	System.out.println("Valor do imposto:" + imposto);
	System.out.println("Total com imposto:" + (valor+imposto)*qtde);
	System.out.println("Total sem imposto:" + (valor * qtde));
	
	
	
	
	
	
	
	
	
	
	
}
}
