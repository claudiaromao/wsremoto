package br.com.gamaimplementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteTurma {
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
	
	Professor professor=new Professor();
	professor.setNome(JOptionPane.showInputDialog("Nome").toLowerCase());
	professor.setFormacao(JOptionPane.showInputDialog("Formacao"));
	
	Curso curso=new Curso();
	curso.setSigla(JOptionPane.showInputDialog("Sigla"));
	curso.setDescricao(JOptionPane.showInputDialog("Descrição"));
	curso.setAtivo(JOptionPane.showInputDialog("Ativo"));
	curso.setValor(JOptionPane.showInputDialog("Valor"));
	curso.setDuracao(JOptionPane.showInputDialog("Duração"));
	
	
	Turma turma=new Turma():
	turma.setSigla(JOptionPane.showInputDialog("Sigla"));
	turma.setCurso(curso);
	turma.setAluno(aluno);
	turma.setProfessor(professor);
	
	
	
	
	
	
	
	
	
}	
}
