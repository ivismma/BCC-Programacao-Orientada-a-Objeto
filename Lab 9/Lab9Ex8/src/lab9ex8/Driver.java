package lab9ex8;

public class Driver {
	public static void main(String args[]) {
		Funcionario f1 = new Funcionario("Joao", "Estoquista", 10001, 42, null, 8765.45);
		
		System.out.println("Salario é: R$ " + f1.getSalario());
		try{
			f1.setChefe(f1);
		}
		catch(ChefeInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}