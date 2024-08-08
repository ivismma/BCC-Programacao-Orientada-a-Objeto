package listaduplamenteencadeada;

//Classe do nó
//Cada nó armazena um int.

public class Node{
	private int registro;
	private Node prox;
	private Node anterior;
	
	public Node(int registro) {
		this.registro = registro;
		this.setProx(null);
		this.setAnterior(null);
	}
	
	public int dado() { // dado contido no nó
		return registro;
	}
	
	public Node getProx() {
		return prox;
	}
	
	public void setProx(Node prox) {
		this.prox = prox;
	}
	
	public Node getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}
}