package lista5ex16;

public class Aluno {
	private String nome;
	private String matricula;
	private Disciplina[] disciplinas;
	private int disc_inscritas;      // qtd disciplinas inscritas.
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		disciplinas = new Disciplina[8]; // Máximo
		disc_inscritas = 0;
	}
	
	public boolean addDisciplina(Disciplina d) {
		// Se cabe mais um aluno...
		if(d.getQtdAlunos()+1 <= d.getMaxAlunos()) {
			d.addAluno(this);
			disciplinas[disc_inscritas] = d;
			disc_inscritas++;
			return true;
		}
		else {
			return false; // Turma cheia.
		}
	}
	
	public boolean removeDisciplina(Disciplina d) {
		if(disc_inscritas == 0) return false; // Se isso acontecer, tem algo errado.
		for(int i = 0; i < disc_inscritas; ++i) {
			if(disciplinas[i] == d) {
				disciplinas[i] = disciplinas[disc_inscritas-1];
				disc_inscritas--;
				return true;
			}
		}
		return false; // Tem algo de errado na implementação que permitiu acontecer isso
		              // (Remoção de disciplina que não estava no array disciplinas[]).
	}
	
	public void exibeInscritas() {
		System.out.print("Disciplinas inscritas de " + nome + ": ");
		if(disc_inscritas == 0) {
			System.out.println("Nenhuma");
			return;
		}
		for(int i = 0; i < disc_inscritas; ++i)
			System.out.print(disciplinas[i].getNome() + " | ");
		System.out.println("");
	}
	
	public String getNome() {
		return nome;
	}
}