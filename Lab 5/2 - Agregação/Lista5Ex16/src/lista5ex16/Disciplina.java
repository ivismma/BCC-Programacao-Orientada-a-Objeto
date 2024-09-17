package lista5ex16;

import java.util.*;

public class Disciplina {
	private String nome;    // Nome da disciplina
	private String cod;     // Código da disciplina
	private int maxAlunos; // Lotação máxima da turma
	private int qtdAlunos;
	private ArrayList<Aluno> alunos;
	
	public Disciplina(String nome, String cod, int lotacao) {
		this.nome = nome;
		this.cod = cod;
		this.maxAlunos = lotacao;
		qtdAlunos = 0;
		alunos = new ArrayList<Aluno>(maxAlunos);
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
		qtdAlunos++;
	}
	
	public boolean removeAluno(Aluno aluno) {
		boolean removidoA = aluno.removeDisciplina(this);
		boolean removidoD = alunos.remove(aluno);
		if(removidoA && removidoD) {
			qtdAlunos--;
			return true;
		}
		else
			return false; // Não encontrado na disciplina.
	}
	
	public void exibeAlunos() {
		System.out.print("Alunos inscritos de " + cod + ": ");
		for(int i = 0; i < qtdAlunos; ++i)
			System.out.print(alunos.get(i).getNome() + " | ");
		System.out.println("");
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	
	public int getMaxAlunos() {
		return maxAlunos;
	}
}
