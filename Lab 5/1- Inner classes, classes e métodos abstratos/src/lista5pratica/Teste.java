package lista5pratica;

import java.util.ArrayList;
public class Teste {
	public static void main(String[] args) {
	Carro c1 = new Carro("VW", Combustivel.GASOLINA);
	Carro c2 = new Carro("GM", Combustivel.ETANOL);
	Carro c3 = new Carro("Honda", Combustivel.GASOLINA);
	
	ArrayList<Carro> lc = new ArrayList<Carro>();
	lc.add(c1);
	lc.add(c2);
	lc.add(c3);
	lc.getFirst().liga();
	//lc = null;
	c1.liga();
	// lc.getFirst().liga();
	c1.liga();
	
	Onibus o1 = new Onibus("Mascarello", Combustivel.DIESEL);
	o1.liga();
	o1.desliga();
	c1.desliga();
	}
}

/*
	Respostas:
	
	Q7)  Duas msgs.
	Q8)  Erro causado pois lc aponta para endereço null.
	Q9)  Ainda existem pois c1, c2 e c3 referenciam eles.
	Q10) "(Carro)" porque o método liga() é herdado da classe
	Carro e "(Veículo terrestre)" porque o método desliga() está
	implementado na classe VeiculoTerrestre.
	
*/