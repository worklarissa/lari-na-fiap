package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteArrayDoWhile {

	//String 
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//Inteiro
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static double real (String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) {
		//Preparar a Lista
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		//Preparar objeto
		Aluno objAluno;
		
		//Entrada
		do {
			objAluno = new Aluno();
			objAluno.setRm(inteiro("Informe o numero do RM"));
			objAluno.setNome(texto("Informe o nome do Aluno"));
			objAluno.setTurma(texto("Informe a turma do Aluno"));
			objAluno.setNota(real("Informe a nota do aluno"));
			
			listaAlunos.add(objAluno);
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?",
				"CADASTRO DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		//Saidas
				for(Aluno a : listaAlunos) {
					System.out.println("\n\nRM: " + a.getRm() +
										"\nNome: " + a.getNome() +
										"\nTurma: " + a.getTurma() +
										"\nNota: " + a.getNota());
				}
		
	}
			

}
