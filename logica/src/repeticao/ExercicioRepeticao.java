package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O jogador 1 irá digitar um número, o jogador 2
		 * terá que advinhar o número digitado pelo jogador 1.
		 * Somente quando ele acertar vai dar a mensagem de "Parabéns"
		 * 
		 * Missao1:
		 * - dê dicas ao Jogador 2, se ele está chutando alto ou baixo.
		 * 
		 * Missao2:
		 * - acrescentar na mensagem de Parabéns, quantas tentativas 
		 * foram utilizadas até que o jogador 2 acertasse.
		 * Dica: vai ter que utilizar uma variável pra contar.
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número 1"));
		int chute=0;
		int contador=0;
		do {
			chute=Integer.parseInt(JOptionPane.showInputDialog("Acerte o número"));
			contador+=1;
			// contador = contador + 1;
			// contador++;
			if (chute>numero) {
				System.out.println("Está chutando alto");
			}else if (chute<numero){
				System.out.println("Está chutando baixo");
			}
		}while(chute!=numero);
		System.out.println("Parabéns... você acertou com " + contador + " tentativa(s)");
	}

}
