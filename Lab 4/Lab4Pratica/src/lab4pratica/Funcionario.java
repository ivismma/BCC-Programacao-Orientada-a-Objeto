package lab4pratica;

public class Funcionario {
	private String nome;
	private int matricula;
	private double salario;
	private Funcionario chefe;
	public Funcionario(String n, int m, double s, Funcionario c){
		nome = n;
		matricula = m;
		salario = s;
		chefe = c;
	}
	public double bonus(Trimestre t){
		return salario * 0.1;
	}
	public String getNome(){
		return this.nome;
	}
	public boolean equals(Funcionario f) {
		return (this.matricula == f.matricula);
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}