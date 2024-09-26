package lab6factory;

public class Carta implements Printavel{
	public enum Valor{
		AS,
		DOIS,
		TRES,
		QUATRO,
		CINCO,
		SEIS,
		SETE,
		OITO,
		NOVE,
		DEZ,
		VALETE,
		DAMA,
		REI
	}
	public enum Naipe{
		OUROS,
		ESPADAS,
		PAUS,
		COPAS
	}
	
	private Valor valor;
	private Naipe naipe;
	public static final int qtdValores = Valor.values().length;
	public static final int qtdNaipes = Naipe.values().length;
	
	public Carta(Valor valor, Naipe naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public String imprimir() {
		return valor + " de " + naipe;
	}
}