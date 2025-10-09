package br.com.arraysListas;

import java.util.LinkedList;
import java.util.Iterator;

public class listasEncadeadas {
	public static void encadeadas() {
		LinkedList<String> ListLinked= new LinkedList<String>();
		ListLinked.add("Solange");
		ListLinked.add("Danubia");
		ListLinked.add("Maria");
		ListLinked.add("Vera Lúcia");
		Iterator<String> it = ListLinked.iterator();
		while (it.hasNext()) {
			String nome = it.next();
			System.out.println(nome);
			
		}
		
		
	}

}
