package br.com.primeirospassos;

import java.util.Scanner;

public class EntryAndLeftData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma idade:  " );
		int idade = sc.nextInt();
		System.out.print("Digite um salario:  " );
		double salario = sc.nextDouble();
		
		System.out.println("Idade Digitada " + idade);
		System.out.println("Salario digitado " + salario);
		sc.close();
	}

}
