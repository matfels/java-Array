package br.com.arraysListas;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class listasEncadeadas {
	public static void encadeadas() {
		List<String> nomelist = new LinkedList<>();
		nomelist.add("Solange");
		nomelist.add("Danubia");
		nomelist.add("Maria");
		nomelist.add("Vera Lúcia");
		Iterator<String> it = nomelist.iterator();
		while (it.hasNext()) {
			String nome = it.next();
			System.out.println(nome);
			
		}
		
		
	}
	
	public static void getfirst() {
		LinkedList<String> lista2 = new LinkedList<>();
		lista2.add("João");
		lista2.add("Antonio");
		lista2.add("Moacir");
		lista2.add("Cleidison");
		
		int tam = lista2.size();
		
		for (int i = 0; i < tam; i++) {
			System.out.println(lista2.getFirst());
			//System.out.println(lista2);
			lista2.removeFirst();
			
		}
		System.out.println(lista2);
		
		
	}

}
