package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaolista2ex1 {
public static void main(String[] args) {
	
	
	
	short diarias = Short.parseShort(JOptionPane.showInputDialog ("Di�rias"));
	if (diarias>15) {
			System.out.println("Total: " + ((80+5.5)*diarias));
	} else if (diarias==15) {
		System.out.println("Total: " + ((80+6)*diarias));
	}	else {
		System.out.println("Total: " + ((80+8)*diarias));
	}
	float taxa = 8;
	if (diarias>15) {
		taxa = (float) 5.5; 
	}else if (diarias==15) {
		taxa=6;
	}
	System.out.println("Total: " + ((85+taxa)*diarias));
	
			
		

}
}