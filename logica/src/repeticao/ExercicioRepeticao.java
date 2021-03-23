package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O jogador 1 ir� digitar um n�mero, o jogador 2
		 * ter� que advinhar o n�mero digitado pelo jogador 1.
		 * Somente quando ele acertar vai dar a mensagem de "Parab�ns"
		 * 
		 * Missao1:
		 * - d� dicas ao Jogador 2, se ele est� chutando alto ou baixo.
		 * 
		 * Missao2:
		 * - acrescentar na mensagem de Parab�ns, quantas tentativas 
		 * foram utilizadas at� que o jogador 2 acertasse.
		 * Dica: vai ter que utilizar uma vari�vel pra contar.
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero 1"));
		int chute=0;
		int contador=0;
		do {
			chute=Integer.parseInt(JOptionPane.showInputDialog("Acerte o n�mero"));
			contador+=1;
			// contador = contador + 1;
			// contador++;
			if (chute>numero) {
				System.out.println("Est� chutando alto");
			}else if (chute<numero){
				System.out.println("Est� chutando baixo");
			}
		}while(chute!=numero);
		System.out.println("Parab�ns... voc� acertou com " + contador + " tentativa(s)");
	}

}
