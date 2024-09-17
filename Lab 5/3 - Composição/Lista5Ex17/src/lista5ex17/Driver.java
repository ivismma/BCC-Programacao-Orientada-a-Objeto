package lista5ex17;

/*
 Crie um código exemplo de composição: Crie as classes Residencia, Comodo, e
também a driver class. Faça com que cada novo objeto do tipo Residencia criado
tenha necessariamente ao menos um cômodo, mas possivelmente mais de um.
Igualmente, não permita que um cômodo possa existir sem estar atrelado a um
objeto de Residencia. Verifique a consistência de visibilidade das suas classes e
atributos, e também de toda a lógica na driver class!
 */

public class Driver {
	public static void main(String args[]) {
		Residencia d1 = new Residencia("Rua ifua2u3i", "Casa");
		
		d1.addComodo("Banheiro 1", 8);
		d1.addComodo("Quarto 1", 12);
		d1.addComodo("Quarto 2", 18);
		d1.addComodo("Cozinha 1", 14);
		d1.exibeComodos();
		d1.removeComodo("Quarto 2");
		d1.exibeComodos();
		
		d1.removeComodo("Quarto 1");
		d1.removeComodo("Banheiro 1");
		d1.removeComodo("Cozinha 1");
		d1.exibeComodos();
		
		// Tentando remover ultimo cômodo...
		d1.removeComodo("Sala 1");
	}
}
