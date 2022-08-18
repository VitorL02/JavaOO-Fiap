package br.com.classesfirstep;

public class Conta {
	
	double saldo;
	int numeroConta;
	int agencia;
	
	Cliente cliente = new Cliente();
	
	
	/**
	 * @author Vitor Lucas Crispim
	 * @version 1.0
	 * @param agencia O numero da conta
	 * @param saldo O valor pertencente a conta
	 *
	 */
	
	public Conta() {
		
	}
	public Conta(int numeroConta,int agencia, double saldo) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo += valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}

}
