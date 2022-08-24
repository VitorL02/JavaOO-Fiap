package br.com.colletions.repeticao.arrays;

public class Strings {
	public static void main(String[] args) {
		String testeConcatenacao = "Teste";
		String maisCaracteres = "Esse e um teste da function concat";
		
		String completo = testeConcatenacao.concat(" - ").concat(maisCaracteres);
		
		System.out.println(completo);
		
		String isEqual = "Ola Mundo";
		String notEqual = "Ola  Mundo";
		System.out.println(isEqual.equals(notEqual));
		System.out.println(isEqual.equalsIgnoreCase(notEqual)); //verifica se as strings são iguais ignorando letras maiusculas e minisculas
		System.out.println(completo.startsWith("Teste"));
		System.out.println(completo.endsWith("Teste"));
		System.out.println(completo.charAt(0)); // Recupera um caractere utilizando o index
		System.out.println("O caractere O está na posição " +completo.indexOf("o"));
		System.out.println("O caractere A apareceu a ultima vez na posição " +completo.lastIndexOf("o"));
		
		System.out.println("Mudando o inicio da frase para: " + completo.substring(completo.lastIndexOf("teste")));
		
	}

}
