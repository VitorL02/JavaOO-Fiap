package br.com.heranca.cursofiap;


public class Conta {
	
	private int numeroAccount, agencia ;
	private double saldo;
	
	public Conta (int numeroAccout) {
		this.numeroAccount = numeroAccount;
	}

	
	
	public int getNumeroAccount() {
		return numeroAccount;
	}


	public void setNumeroAccount(int numeroAccount) {
		this.numeroAccount = numeroAccount;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar (double valor) {
		System.out.println("Depositando valor: " + valor);
		return this.saldo += valor ;
	}
	
	public void retirar (double valor ) {
		this.saldo -= valor;
	}


}