package br.com.banco.model;

public class ContaBancaria {
	private String titular;
	private double saldo;


	public ContaBancaria(String titular, double saldoInicial) {
	this.titular = titular;
	this.saldo = saldoInicial;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	// O "throws" avisa que este método pode dar errado
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor <= 0) {
			// "throw new" é como disparar o alarme
			throw new IllegalArgumentException("O VALOR DO SAQUE DEVE SER POSITIVO!");
		}
		
		if (valor > saldo) {
			throw new SaldoInsuficienteException("SALDO INSUFICIENTE! VOCÊ TEM APENAS R$ " + saldo);
		}
		this.saldo -= valor;
		}
}