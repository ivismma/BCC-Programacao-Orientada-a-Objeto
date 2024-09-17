package lista5ex16;

/*
 Crie um código exemplo de agregação: com as classes Disciplina, Aluno e também
a driver class. Permita que cada disciplina possa ter vários alunos e cada aluno
possa estar em mais de uma disciplina. Na sua implementação, fique à vontade para
escolher entre o uso de Array básico ou de um ArrayList (como fizemos no exercício
anterior).
 */

public class Driver {
	public static void main(String args[]) {
		Disciplina d1 = new Disciplina("Programação Orientada a Objeto", "ICP239", 60);
		Aluno a[] = {
				new Aluno("Ivis", "12345678"),
				new Aluno("Andre", "12345678"),
				new Aluno("Marcos", "12345678"),
				new Aluno("Felipe", "12345678")
		};
		
		
		a[0].addDisciplina(d1);
		d1.exibeAlunos();
		a[0].exibeInscritas();
		d1.removeAluno(a[0]); // Ivis removido
		System.out.println("Removido Ivis da turma de POO...");
		a[0].exibeInscritas(); // Vai mostrar nenhum.
		System.out.println("Adicionando 3 alunos a POO e todos para nova turma de ESD...");
		for(int i = 1; i < 4; ++i) // Adiciona os 3 ultimos na turma
			a[i].addDisciplina(d1);
		
		Disciplina d2 = new Disciplina("Estruturas de Dados", "ICP116", 60);
		// Adiciona todos na turma de ESD.
		
		for(int i = 0; i < 4; ++i)
			a[i].addDisciplina(d2);
		
		
		d1.exibeAlunos();
		d2.exibeAlunos();
		a[2].exibeInscritas();
	}
	
}
