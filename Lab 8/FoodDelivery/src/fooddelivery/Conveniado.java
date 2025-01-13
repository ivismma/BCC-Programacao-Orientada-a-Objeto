package fooddelivery;

public interface Conveniado {
	public abstract String getNome();
	
	public void solicitaAtualizacao(Emissor e);
	public void atualizaEngajamento(int engajamento);
}
