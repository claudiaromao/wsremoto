package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
	
		int numero1=0;
		int numero2=0;
		String operacao="";
		String resp="";
		
		
		do {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog ("N�mero1"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog ("N�mero2"));
			operacao= JOptionPane.showInputDialog ("Digite o operador");
			if(operacao.equals("+")==true){
			System.out.println("Resultado: " + (numero1 + numero2));
		}else if(operacao.equals("-")){
			System.out.println("Resultado: " + (numero1 - numero2));
		} else if(operacao.equals("*")){
			System.out.println("Resultado: " + (numero1 * numero2));
		} else if(operacao.equals("/")){
			System.out.println("Resultado: " + (numero1 / numero2));
		}else {
			System.out.println("Voc� n�o digitou um operador v�lido");
		}
		resp=JOptionPane.showInputDialog("Digite <S> para continuar").toLowerCase();
		}while (resp.contentEquals("S"));
	}
					
					
		
		
	}


