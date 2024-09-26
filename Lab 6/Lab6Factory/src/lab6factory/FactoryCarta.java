package lab6factory;

import java.util.Random;

public class FactoryCarta {
	public static Carta geraCarta() {
		Random rand = new Random();
		// Randomizar número e naipe
		Carta.Valor valor = Carta.Valor.values()[rand.nextInt(Carta.qtdValores)];
		Carta.Naipe naipe = Carta.Naipe.values()[rand.nextInt(Carta.qtdNaipes)];

		return new Carta(valor, naipe);
	}	
}