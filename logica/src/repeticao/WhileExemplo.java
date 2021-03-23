package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {

		String email=JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.contains("@")==false){
			email= JOptionPane.showInputDialog("Email com @").toLowerCase();
		}
			System.out.printf("Usuário" + email.substring(0,email.indexOf("@")));
			
		
			String nome=JOptionPane.showInputDialog("Digite o nome").toLowerCase();
			while (nome.length()<3||nome.length()>15) {
				nome= JOptionPane.showInputDialog("Digite o nome novamente").toLowerCase();
			}
			System.out.println("Nome: "+ nome);
			
			
			
	}

}
