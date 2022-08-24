package br.com.colletions.repeticao.arrays;

public class Arrays {

	public static void main(String[] args) {
		int notas[] = new int[3];
		notas[0] = 10;
		notas[1] = 15;
		notas[2] = 25;
		System.out.println(notas[0]);
		
		String names[] = { "Vitor","Clara" };
		//String names[] = new String { "Vitor","Clara" };
		//Carro carros [] new Carro[10]; Possivel criar arrays de classes
		
		//for (int i = 0; i < 2; i++ ) {
			//System.out.println(names[i]);
		//}
		
		for (int i = 0; i < names.length; i++ ) {
			System.out.println(names[i]);
		}
		

		
	}

}
