package lista2ex;

public class Funcionario {
	public static final double SALARIO_HORA_MIN = 12.50;
	private static int proxID = 1;
	private String nome;
	private final int ID_FUNC;
	private double salarioHora;
	private double horasTrabalhadasMes = 0;
	
	// Construtores:
	public Funcionario(String nome) {
		this.nome = nome;
		this.ID_FUNC = proxID++;
		this.salarioHora = SALARIO_HORA_MIN;
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.ID_FUNC = proxID++;
		if(salario >= SALARIO_HORA_MIN)
			this.salarioHora = salario;
		else
			this.salarioHora = SALARIO_HORA_MIN;
	}
	
	// Getters:
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIDFuncionario() {
		return this.ID_FUNC;
	}
	
	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public int getProxID() {
		return proxID;
	}
	
	// Outros métodos:
	
	public double calcularSalarioMes() {
		return salarioHora * horasTrabalhadasMes;
	}
	
	public void reiniciarMesTrabalho() {
		this.horasTrabalhadasMes = 0;
	}
	
	public void atualizaNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void atualizaSalarioHora(double novoSalario) {
		this.salarioHora = novoSalario;
	}
	                    // Recebe as horas trabalhadas no dia.
	public void adicionarDiaDeTrabalho(double horas) {
		if(horas >= 4)
			this.horasTrabalhadasMes += horas;
		else
			System.out.println("Não foi possível registrar o dia de trabalho - " + 
		"Horas trabalhadas inferior a 4 horas.");
	}
}
