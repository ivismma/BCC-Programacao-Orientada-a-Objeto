package lista5pratica;

public class Onibus extends VeiculoTerrestre{
	private class Motor{
		Combustivel tipoCombustivel;
		public Motor(Combustivel c){
			this.tipoCombustivel = c;
		}
		public void liga(){}
	}
	private Motor meuMotor;
	//String modelo; Comentando essa linha, o "modelo" da superclasse é usado.
	public Onibus(String modelo, Combustivel combustivel){
		this.modelo = modelo;
		meuMotor = new Motor(combustivel);
	}
	
	@Override // Msg. para ônibus.
	public void liga(){
		meuMotor.liga();
		System.out.println(modelo + " ligado! (Ônibus)");
	}
	@Override
	public void desliga(){
		System.out.println(modelo + " desligado! (Ônibus)");
	}
}