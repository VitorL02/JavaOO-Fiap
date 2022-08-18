package br.com.banco;

public class GeraConta {

	public static void main(String[] args) {
		int agencia;
		int numero;
		double saldo;
		String nome ;
		int idade ;
		double valorDepositado = 150;
	
		
		Conta contaCorrente = new Conta();
		
		contaCorrente.setAgencia(22);
		contaCorrente.setNumeroAccount(10000);
		contaCorrente.setSaldo(0);
		contaCorrente.cliente.setIdade(21);
		contaCorrente.cliente.setNome("Vitor");

		
		
		
		agencia = contaCorrente.getAgencia();
		numero = contaCorrente.getNumeroAccount();
		saldo = contaCorrente.getSaldo();
		nome = contaCorrente.cliente.getNome();
		idade = contaCorrente.cliente.getIdade();
		
		
		
		System.out.println("Conta corrente dados");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Agencia: " + agencia);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		contaCorrente.depositar(valorDepositado);
		System.out.println("Saldo apos deposito : " + saldo);
		
		
	
		
		
	}

}
