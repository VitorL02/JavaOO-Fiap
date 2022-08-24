package br.com.colletions.repeticao.arrays;

public class Matrizes {
	public static void main(String[] args) {
		//Declara um array de arrays, pode ser usado para armazenar por exemplo em 9 disciplinas 40 diferentes notas
		int[][] notas = new int[9][40];
		notas[0][0] = 10;
		notas[0][1] = 20;
		
		for(int  i = 0; i < notas.length; i++) {
			System.out.println("Nota da disciplina: " + notas[i][i]);
		}
	}

}
