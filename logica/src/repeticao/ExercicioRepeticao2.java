package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {
public static void main(String[] args) {
	
	/*
	 * Exercicio 2
 	Monte um programa que solicite a idade e o nome das pessoas. A aplicação continuará perguntando nome e idade enquanto o usuário afirmar que deseja continuar.
	Ao terminar, a aplicação deverá exibir:
- a quantidade de pessoas maiores de idade e 
- a média entre todas as idades que foram digitadas. 
- a pessoa mais experiente (nome e idade)
- a pessoa mais jovem (nome e idade)
	 */
	
	String nome="";
	short idade=0;
	short qtdeMaioresIdade=0;
	short totalIdades=0;
	short qtdePessoas=0;
	String nomeMaisExperiente="";
	short idadeMaisExperiente=0;
	String nomeMaisJovem="";
	short idadeMaisJovem=0;
	do {
		nome = JOptionPane.showInputDialog("Digite o nome");
		idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));		
		if (idade<idadeMaisJovem || qtdePessoas==0) {
			idadeMaisJovem = idade;
			nomeMaisJovem = nome;
		}else if (idade>idadeMaisExperiente) {
			idadeMaisExperiente = idade;
			nomeMaisExperiente = nome;
		}
		qtdePessoas+=1;
		totalIdades+=idade;
		if (idade>=18) {
			qtdeMaioresIdade+=1;
		}
	}while(JOptionPane.showConfirmDialog
		(null, "Continuar?", "Exercicio 2", JOptionPane.YES_NO_OPTION)==0);
	
	JOptionPane.showMessageDialog(null, "Maiores de idade: " + qtdeMaioresIdade);
	JOptionPane.showMessageDialog(null, "Media de idade: " + (totalIdades/qtdePessoas));
	JOptionPane.showMessageDialog(null, 
			"Nome Mais Experiente: " + 
					nomeMaisExperiente + "\nIdade Mais Experiente: " + 
					idadeMaisExperiente);		
	JOptionPane.showMessageDialog(null, 
			"Nome Mais Jovem: " + 
					nomeMaisJovem + "\nIdade Mais Jovem: " + 
					idadeMaisJovem);

	
}
}
