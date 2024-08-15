package aula1;
import java.util.*;

public class Main {
	
	// Anotações:
	// Por padrão, literais racionais do Java são double (!!!).
	// Para float, usar: float (...) = 3f <-- sufixo f.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ex1(sc);
		// ex2(sc);
		// ex3(sc);
		
		long n;
		do{
			System.out.print("Digite n: ");
			n = sc.nextLong();
		} while(n < 0 || n > 20);
		System.out.println(n + "! = " + ex4fatorial(n));
		
		//ex5(sc);
		
		sc.close();
	}
	
	/* Ex. 1 (enunciado)
	Escreva um programa em Java que leia 2 raios R e r de entrada e
	calcula a área da coroa circular A = pi * (R²-r²). Considere 
	pi = 3,14159
	 */
	
	public static void ex1(Scanner sc) {
		final double pi = 3.14159;
		double R, r, res;
		
		System.out.print("Digite o raio R: ");
		R = sc.nextDouble();
		System.out.print("Digite o raio r: ");
		r = sc.nextDouble();
		
		res = pi*(R*R-r*r);
		System.out.println("Área da coroa circular: " + res);
	}
	
	
	/*
	    Ex. 2 (enunciado)
	    Escreva um programa em Java que peça ao usuário seu nome (como
	    uma String - Java possui o tipo String!), idade (int) e altura
	    (double) e imprima na tela as três informações.
	*/
	public static void ex2(Scanner sc) {
		String nome;
		int idade;
		double altura;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite a sua altura: ");
		altura = sc.nextDouble(); // USAR VÍRGULA (!!!)
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade + 
		"\nAltura: " + altura);
		
	}
	
	/* Ex. 3 (enunciado)
		Escreva um programa em Java que receba as duas notas de um aluno e
		calcule se o aluno ficou aprovado, em prova final ou reprovado. Considere:
		Aprovação: Média >= 7;
 		Prova final: 3 <= Média < 7;
 		Reprovação: Média < 3.
	*/
	
	public static void ex3(Scanner sc) {
		double n1, n2;
		
		System.out.print("Digite a nota 1: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		n2 = sc.nextDouble();
		final double media = (n1+n2)/2;
		System.out.println("\nMédia: " + media);
		
		if(media >= 7)
			System.out.println("APROVADO");
		else if(media >= 3)
			System.out.println("PROVA FINAL");
		else
			System.out.println("REPROVADO");
		
	}
	
	/* Ex. 4 (enunciado)
		Escreva um programa em Java que leia um número inteiro N de
		entrada (0 <= N <= 20) e calcule recursivamente o seu fatorial.
	 */
	
	public static long ex4fatorial(long n) {
		if(n == 0)
			return 1;
		else
			return n*ex4fatorial(n-1);
	}
	
	/* Ex. 5 (enunciado)
		Escreva um programa em Java que:
		i) crie um array de 5 inteiros, daí
		ii) leia 5 inteiros do teclado e, a cada inteiro lido, o coloque na próxima
		posição vaga do vetor, a partir da primeira (cujo índice é 0!);
		iii) Agora, com vetor já preenchido, percorra-o e identifique o seu maior
		elemento e o imprima na tela
		
		Note que a 1a diferença para o C é a posição dos colchetes. Outra diferença é o
		possível uso da palavra-chave new. Uma semelhança, porém, é que em ambas as
		linguagens um array pode ser criado a partir de uma lista de inicialização (2 primeiros
		casos). Outro ponto em comum é que arrays em Java e em C possuem tamanho
		imutável. Mais adiante aprenderemos a usar o container ArrayList<>, mais
		conveniente por oferecer mudança dinâmica de tamanho, entre outras
		funcionalidades.
	 */
	
	public static void ex5(Scanner sc) {
		int[] n = new int[5];
		
		for(int i = 0; i < 5; ++i) { // leitura
			System.out.print("n[" + i + "] = ");
			n[i] = sc.nextInt();
		}
		int maior = n[0];
		for(int i = 1; i < 5; ++i)
			if(n[i] > maior) maior = n[i];
		
		System.out.println("\nMaior elemento do array: " + maior);
	}
	
}

