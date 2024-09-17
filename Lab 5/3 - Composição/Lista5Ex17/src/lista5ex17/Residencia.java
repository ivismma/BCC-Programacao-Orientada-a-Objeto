package lista5ex17;

import java.util.*;

public class Residencia {
	private class Comodo{
		private String nome;            // Ex: Cozinha
		private double metragem; // m³
		public Comodo(String nome, double m) {
			this.nome = nome;
			this.metragem = m;
		}
		public String getNome() {
			return nome;
		}
	}
	
	private String endereco;
	private String tipo; // Casa, apt, etc..
	private ArrayList<Comodo> comodos;
	private int qtdComodos;
	
	public Residencia(String endereco, String tipo) {
		this.endereco = endereco;
		this.tipo = tipo;
		comodos = new ArrayList<Comodo>();
		comodos.add(new Comodo("Sala 1", 81)); // Por padrão terá "Sala 1".
		qtdComodos = 1;
	}
	
	public int existeComodo(String nome) {
		int i; 
		for(i = 0; i < comodos.size(); ++i) {
			if(comodos.get(i).getNome() == nome) 
				return i; // Esse cômodo ja existe, retorna seu indice.
		}
		return -1; // Não existe, retorna -1.
	}
	public boolean removeComodo(String nome) {
		int pos = existeComodo(nome);
		if(qtdComodos == 1) {
			System.out.println("Não é possível remover o último cômodo, A residência deve ser removida nesse caso.");
			return false;
		}
		if(pos == -1) {
			System.out.println("O cômodo inserido (" + nome + ") não existe na residência.");
			return false; // Não removeu porque não existe.
		}
			
		comodos.remove(pos);
		qtdComodos--;
		System.out.println("Cômodo  (" + nome + ") removido.");
		return true;
	}
	
	public void exibeComodos() {
		System.out.print("Cômodos: ");
		for(int i = 0; i < comodos.size(); ++i) {
			System.out.print(comodos.get(i).getNome() + " | ");
		}
		System.out.println("");
	}
	
	public void addComodo(String nome, double m) {
		comodos.add(new Comodo(nome, m));
		qtdComodos++;
	}
}
