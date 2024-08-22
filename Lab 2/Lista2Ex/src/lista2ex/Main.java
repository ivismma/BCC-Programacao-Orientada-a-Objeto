package lista2ex;
// import java.util.*;

public class Main {
	public static void main(String args[]) {
		Funcionario func1 = new Funcionario("Hugo");
		
		func1.adicionarDiaDeTrabalho(8);
		func1.adicionarDiaDeTrabalho(8);
		func1.adicionarDiaDeTrabalho(8);
		System.out.println("Salario atual: R$ " + func1.calcularSalarioMes());
		System.out.println(func1.getProxID());
		func1.atualizaNome("João");
		System.out.println(func1.getNome());
	}
}