package lista5pratica;

public class Carro extends VeiculoTerrestre{
	private class Motor{
		Combustivel tipoCombustivel;
		public Motor(Combustivel c){
			this.tipoCombustivel = c;
		}
		public void liga(){}
	}
	private Motor meuMotor;
	// String modelo;
	public Carro(String modelo, Combustivel combustivel){
		this.modelo = modelo;
		meuMotor = new Motor(combustivel);
	}
	@Override
	public void liga(){
		meuMotor.liga();
		System.out.println(modelo + " ligado! (Carro)");
	}
}