package br.com.primeirospassos;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		double height,weight,imc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		weight = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		height = sc.nextDouble();
		imc = weight / (height  * height);
		
		
		System.out.println("Seu imc é: " +  imc );
		
		if(imc >= 18.5 && imc <= 25) {
			System.out.println("Peso ideal");
			sc.close();
		}else {
			System.out.println("Fora do peso");
			sc.close();
		}
		
	}

}
