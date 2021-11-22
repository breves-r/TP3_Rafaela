package br.edu.infnet.exceptions;

public class SalarioNegativoException extends Exception {
	private static final long serialVersionUID = 1L;

	public SalarioNegativoException(String mensagem) {
		super(mensagem);
	}
	

}
