package br.com.colletions.repeticao.arrays;

import java.util.Scanner;

public class loopWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String option;
		
		do {
			System.out.println("Digite um numero");
			int firstNumber = scanner.nextInt();
			
			System.out.println("Digite outro numero");
			int secondNumber = scanner.nextInt();
			
			int sum = firstNumber + secondNumber;
			System.out.println("A soma é : " + sum);
			System.out.println("Deseja Somar outro numero? (S/N)");
			option = scanner.next();
		}while(option.equals("S") || option.equals("s"));
		scanner.close();
		
	}

}
