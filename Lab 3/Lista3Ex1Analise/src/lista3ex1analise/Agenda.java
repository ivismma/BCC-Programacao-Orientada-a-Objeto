package lista3ex1analise;

public class Agenda {
	private Contato[] meusContatos;
	private final int MAX = 100;
	private int total = 0;
	//Construtor:
	public Agenda(){
		meusContatos = new Contato[MAX];
	}
	public boolean ehDuplicado(Contato c) {
		for (int i = 0; i < total; ++i) {
			if (c.equals(meusContatos[i])) { //Chama o nosso "equals()"!
				return true;
			}
		}
		return false;
	}
	public void listarContatos(){
		System.out.println("Listagem dos contatos: ");
		for (int i = 0; i < total; ++i) {
			Contato c = meusContatos[i];
			System.out.println(c.getNome() + " | " + c.getTel());
		}
		System.out.println("Total de " + total + " contatos listados.\n");
	}
	public boolean adicionarContato(Contato c){
		if(total == MAX || ehDuplicado(c)) {
			System.out.println("O contato [" + c.getNome() + " | " + c.getTel() + 
			"] não foi adicionado - já consta na agenda.");
			return false;
		}
		
		meusContatos[total++] = c;
		return true;
	}
	
	public int posicaoNaLista(Contato c) {
		for(int i = 0; i < total; ++i) {
			if(c == meusContatos[i]) // comparação de referência.
				return i;
		}
		return -1; // não achou.
	}
	
	public boolean removerContato(Contato c){
		int pos = posicaoNaLista(c);
		
		if(pos == -1) {
			System.out.println(c.getNome() + " não foi removido - não consta na lista.");
			return false; // não está na lista.
		}
		
		meusContatos[pos] = meusContatos[total-1];
		--total;
		System.out.println(c.getNome() + " foi removido(a) da lista.");
		return true;
	}
}