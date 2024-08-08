package listaduplamenteencadeada;

public class OpInvalidaException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public OpInvalidaException(String msgErro) {
		super(msgErro);
	}
}