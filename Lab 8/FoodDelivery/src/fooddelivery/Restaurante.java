package fooddelivery;

public class Restaurante implements Conveniado{
	private final String CNPJ;
	private final String nome;
	private double engajamentoCliente; // Desconto do cliente atual
	
	public Restaurante(String CNPJ, String nome){
		this.CNPJ = CNPJ;
		this.nome = nome;
	}
	@Override
	public String getNome(){
		return nome;
	}
	@Override
	public void solicitaAtualizacao(Emissor e) {
		e.notifica(this);
	}
	@Override
	public void atualizaEngajamento(int engajamento) {
		engajamentoCliente = engajamento;
	}
	
	public void imprimeDesconto(Cliente c) {
		solicitaAtualizacao(c);
		System.out.println("O desconto é de R$ " + c.meuDesconto());
	}
}
