package variaveis;

import javax.swing.JOptionPane;

public class TipoPrimitivos {
 public static void main(String[] args) {

	 String time1 = JOptionPane.showInputDialog("Digite o time1");
	 String time2 = JOptionPane.showInputDialog("Digite o time2");
	 double entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite a entrada."));
	 int publico= Integer.parseInt(JOptionPane.showInputDialog("Digite o público."));
	 double total = entrada *publico;
	 
	 System.out.printf("No jogo entre %s e %s a arrecadação foi de: R$ %.2f", time1, time2, total);
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
}
