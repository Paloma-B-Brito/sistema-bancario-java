package br.com.banco.model;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
