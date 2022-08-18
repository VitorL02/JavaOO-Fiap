package br.com.heranca.cursofiap;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double chequeEspecial;
	
	public ContaCorrente(String tipo, int numero) {
		/*Como o construtor de conta foi criado com um parametro,
		obrigatoriamente o construtor de ContaCorrente precisa passar esse parametro como super */
		super(numero);
		this.tipo = tipo ;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	@Override
	public void retirar(double valor) {
		valor = valor + 10;
		super.retirar(valor);
	}

}
