package listaduplamenteencadeada;

//Classe da Lista duplamente encadeada
//e seus métodos de gerenciamento

public class Lista {
	protected Node inicio;
	protected Node fim;
	protected int tamanho;
	
	public Lista() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean vazia() {
		return this.inicio == null;
	}
	
	public void inserirInicio(int registro) {
		if(vazia()) {
			this.inicio = new Node(registro);
			this.fim = this.inicio;
		}
		else {
			Node novoNode = new Node(registro);
			this.inicio.setAnterior(novoNode);
			novoNode.setProx(this.inicio);
			// novoNode.setAnterior(null);
			this.inicio = novoNode;
		}
		++this.tamanho;
	}
	
	public void inserirFim(int registro) {
		if(this.inicio == null) {
			inserirInicio(registro);
			return;
		}
		else {
			Node novoNode = new Node(registro);
			this.fim.setProx(novoNode);
			novoNode.setAnterior(this.fim);
			this.fim = novoNode;
			++this.tamanho;
		}
	}
	
	public void inserir(int registro, int pos) {
		if(pos < 0 || pos > this.tamanho) { // caso 1
			throw new OpInvalidaException("Operação de inserção (índice " + 
					  pos + ") inválida - out of range.");
		}
		else if(pos == 0) {                 // caso 2 (início)
			inserirInicio(registro);
		}
		else if(pos == this.tamanho) {      // caso 3 (fim)
			inserirFim(registro);
		}
		else {                  // caso 4 (percorrer até o nó)
			// começar pelo lado mais perto do nó (esquerda ou direita).
			Node novoNode = new Node(registro);
			Node atual;
			if(pos > this.tamanho/2) { // percorre começando pelo fim (dir)
				atual = this.fim;
				for(int i = this.tamanho-1; i >= pos; --i) {
					atual = atual.getAnterior();
				}
			}
			else {                     // percorre começando pelo início (esq)
				atual = this.inicio;
				for(int i = 0; i < pos-1; ++i) {
					atual = atual.getProx();
				}
			}
			// Amarrar os nós...
			novoNode.setProx(atual.getProx());
			novoNode.setAnterior(atual);
			atual.setProx(novoNode);
			novoNode.getProx().setAnterior(novoNode);
			
			++this.tamanho;
		}
	}
	
	public int removerInicio() {
		if(vazia()) {
			throw new OpInvalidaException("Operação de remoção  "
					+ "inválida - lista vazia.");
		}
		int registro = this.inicio.dado();
		
		if(this.inicio.getProx() == null) {
			this.inicio = null;
			this.fim = null;
		}
		else {
			this.inicio = this.inicio.getProx();
			this.inicio.setAnterior(null);
		}
		
		--this.tamanho;
		return registro;
	}
	
	public int removerFim() {
		if(vazia()) {
			throw new OpInvalidaException("Operação de remoção "
					+ "inválida - lista vazia.");
		}
		int registro = this.fim.dado();
		
		if(this.fim.getAnterior() == null) { // é o unico nó.
			this.inicio = null;
			this.fim = null;
		}
		else {
			this.fim = this.fim.getAnterior();
			this.fim.setProx(null);
		}
		
		--this.tamanho;
		return registro;
	}
	
	public int remover(int pos) {
		if(vazia()) {
			throw new OpInvalidaException("Operação de remoção " + 
					  "inválida - lista vazia.");
		}
		if(pos < 0 || pos >= this.tamanho) {
			throw new OpInvalidaException("Operação de remoção (índice " + 
									  pos + ") inválida - out of range.");
		}
		if(pos == 0) {
			return removerInicio();
		}
		if(pos == this.tamanho-1) {
			return removerFim();
		}
		
		// começar pelo lado mais perto do nó (esquerda ou direita).
		Node atual;
		if(pos > this.tamanho/2) { // percorre começando pelo fim (dir)
			atual = this.fim;
			for(int i = this.tamanho-1; i > pos; --i) {
				atual = atual.getAnterior();
			}
		}
		else {                     // percorre começando pelo início (esq)
			atual = this.inicio;
			for(int i = 0; i < pos; ++i) {
				atual = atual.getProx();
			}
		}
		// Obter registro do nó, removê-lo e amarrar os nós.
		int registro = atual.dado();
		atual.getAnterior().setProx(atual.getProx());
		atual.getProx().setAnterior(atual.getAnterior());
		
		--this.tamanho;
		return registro;
	}
	
	public void exibir() {
		Node atual = this.inicio;
		// int i = 0;
		while(atual != null) {
			System.out.print(atual.dado() + " ");
			atual = atual.getProx();
		}
		System.out.println();
	}
	
	public void msgTamanho() {
		System.out.println("Tamanho da lista: " + this.tamanho());
	}
}