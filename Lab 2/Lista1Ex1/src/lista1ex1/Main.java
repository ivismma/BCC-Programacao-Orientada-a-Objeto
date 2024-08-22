package lista1ex1;
import java.util.*;

/*
	 Faça um programa que calcule a média de notas de uma turma.
	 As notas serão inseridas até se encontrar uma nota -1, onde
	 o programa retorna a média calculada.
*/

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double nota, soma = 0;
		int qtd = 0;
		
		do {
			nota = sc.nextDouble();
			if(nota == -1) break;
			
			soma += nota;
			++qtd;
		} while(true);
		double media = soma/qtd;
		System.out.println("Média: " + media);
		
		sc.close();
	}
}
