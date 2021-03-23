package br.com.gamaimplementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {

public static void main(String[] args) {
	
	Endereco endereco= new Endereco();
	endereco.setLogradouro("AVENIDA ITAQUERA");
	endereco.setNumero("385A-fundos");
	endereco.setComplemento("Viela321");
	endereco.setBairro("ITAQUERIA");
	endereco.setCidade("SÃO PAULO");
	endereco.setUf("SP");
	endereco.setCep("12345-678");
		
	
	Aluno aluno=new Aluno();
	aluno.setEndereco(endereco);
	aluno.setEmail(JOptionPane.showInputDialog("email").toLowerCase());
	aluno.setFone(JOptionPane.showInputDialog("Fone"));
	aluno.setNome(JOptionPane.showInputDialog("Nome").toLowerCase());
	aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula").toLowerCase()));
	
System.out.println("Nome:" + aluno.getNome() );
System.out.println("Email:" + aluno.getEmail() );
System.out.println("Fone:" + aluno.getFone() );
System.out.println("Matricula:" + aluno.getMatricula() );
System.out.println("Endereco:" + aluno.getEndereco() );

//OU

Aluno aluno2 =new Aluno();
aluno2.setAll(
		endereco,
		JOptionPane.showInputDialog("Nome2").toLowerCase(), 
		Integer.parseInt(JOptionPane.showInputDialog("Matricula2").toLowerCase()), 
		JOptionPane.showInputDialog("email2").toLowerCase(), 
		JOptionPane.showInputDialog("Fone2")
		);

System.out.println(aluno2.toString());

}
}
