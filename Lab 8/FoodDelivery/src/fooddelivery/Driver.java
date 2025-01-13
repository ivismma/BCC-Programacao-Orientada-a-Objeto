	package fooddelivery;

public class Driver {
	public static void main(String[] args) {
		Ifood app = new Ifood();
		
		Cliente c1 = new Cliente("Ana");
		Cliente c2 = new Cliente("José");
		c1.fazerPedido(app.getParceiro("Ronald's Pizza"), true);
		c2.fazerPedido(app.getParceiro("Lonaldo Comida Japonesa"), false);
	}
}