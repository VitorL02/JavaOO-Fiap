package br.com.colletions.repeticao.arrays;

public class Notas {

	public static void main(String[] args) {
		int notas[] = new int[]{10,15,17,25,27};
		double totalNotas = 0;

		
		for(int i = 0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		double mediaNotas = totalNotas/notas.length;
		
		System.out.println("Media: "  +  mediaNotas);

	}

}
