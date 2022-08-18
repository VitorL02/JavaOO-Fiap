package br.com.classesfirstep;

public class InstaciandoConta {

	public static void main(String[] args) {
		Conta  acount = new Conta();
		acount.saldo = 1000;
		double valor = acount.saldo;
		System.out.println(valor);
		
		String nome = acount.cliente.nome = "Vitor";
		 
		
		acount.depositar(500);
		System.out.println("Seu saldo é : " + acount.consultarSaldo());
		
		Conta poupanca = new Conta(111,250,5000);
		
		if (poupanca != null) {
			System.out.println("Existe uma conta poupança com o numero " + nome );
		}
		
		System.out.println("Seu saldo da conta poupança é: " + poupanca.consultarSaldo());
		System.out.println("O nome do dono da conta é: " +acount.cliente.nome);
	}

}
