package lab6singleton;

public class Driver {
	public static void main(String args[]) {
		Pontuacao p1 = Pontuacao.getPontuacao();
		System.out.println(p1.getPontos());
		p1.ganhaPontos(5);
		System.out.println(p1.getPontos());
		p1.ganhaPontos(8);
		System.out.println(p1.getPontos());
		
		Pontuacao p2 = Pontuacao.getPontuacao(); // A instância já existente.
		// Usar diretamente new Pontuacao() não funciona pois o construtor é private.
		
		System.out.println(p2.getPontos());
	}
}
