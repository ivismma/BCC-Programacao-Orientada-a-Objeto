package lab9ex8;

public class Funcionario {
	private String nome;
	private String cargo;
	private int matricula;
	private int idade;
	private Funcionario chefe;
	private double salario;
	
	public Funcionario(String n, String c, int m, int i, Funcionario fc, double s) {
		this.nome = n;
		this.cargo = c;
		this.matricula = m;
		this.idade = i;
		this.chefe = fc; // deverá receber null se não tiver.
		this.salario = s;
	}
	
	/*public boolean mesmaChefia(Funcionario f) {
		
	}*/

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Funcionario getChefe() {
		return chefe;
	}

	public void setChefe(Funcionario chefe) throws ChefeInvalidoException {
		if(chefe == this)
			throw new ChefeInvalidoException();
		this.chefe = chefe;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}