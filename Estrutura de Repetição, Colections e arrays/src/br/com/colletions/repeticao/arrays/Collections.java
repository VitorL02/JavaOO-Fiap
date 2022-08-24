package br.com.colletions.repeticao.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Vitor");
		lista.add("Clara");
		lista.add("teste");
		
		System.out.println(lista.get(1));
		lista.remove(2);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("Clara está na lista no valor : " + lista.indexOf("Clara"));
		
		HashSet<Object> listaSemRepeticao = new HashSet<>();
		
		listaSemRepeticao.add("Teste");
		listaSemRepeticao.add("Teste");
		listaSemRepeticao.add("Dragon Ball");
		listaSemRepeticao.add("One piece");
		
		System.out.println(listaSemRepeticao);
		
		HashMap matriculas = new HashMap();
		
		matriculas.put("MT01","Vitor");
		matriculas.put("MT02","Lucas");
		matriculas.put("MT03","Eduardo");
		System.out.println(matriculas);
		System.out.println(matriculas.get("MT03"));
		
		
	}

}
