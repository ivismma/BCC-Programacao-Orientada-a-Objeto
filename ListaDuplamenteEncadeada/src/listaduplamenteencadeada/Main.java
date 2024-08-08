package listaduplamenteencadeada;

public class Main {
	public static void main(String arg[]) {
		
		Lista lista = new Lista();
		
		lista.inserirFim(3);
		lista.inserirFim(4);
		lista.inserirFim(5);
		lista.inserirFim(6);
		lista.inserirFim(7);
		lista.inserirInicio(2);
		
		System.out.println("Lista: ");
		lista.exibir();
		lista.msgTamanho();
		
		lista.inserir(10, 4);
		System.out.println("Lista após inserção de (10) no índice 4:");
		lista.exibir();
		lista.msgTamanho();
		
		int removido = lista.remover(4);
		System.out.println("Lista após remoção do índice 4 (" + removido + "):");
		lista.exibir();
		lista.msgTamanho();
		
	}
}
