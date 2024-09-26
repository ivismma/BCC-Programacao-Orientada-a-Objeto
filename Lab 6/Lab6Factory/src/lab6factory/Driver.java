package lab6factory;

import java.util.ArrayList;

public class Driver {
	public static void main(String args[]) {
		final int qtd = 5;
		ArrayList<Carta> mao = new ArrayList<Carta>();
		
		for(int i = 0; i < qtd; ++i) 
			mao.add(FactoryCarta.geraCarta());
		
		System.out.println("Cartas geradas: ");
		for(int i = 0; i < qtd; ++i)
			System.out.println(mao.get(i).imprimir());
		
	}
}