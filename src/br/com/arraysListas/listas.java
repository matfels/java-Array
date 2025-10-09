package br.com.arraysListas;

import java.util.ArrayList;
import java.util.Iterator;

public class listas {
	
	public static void listass() {
		ArrayList<String> lista1 = new ArrayList<String>(10);
		lista1.add("João");
		lista1.add("Maria");
		lista1.add("Vera");
		lista1.add("Antonio");
		lista1.add("Alcides");
		lista1.add("Lurdes");
		lista1.add("Madalena");
		lista1.add("Jose");
		lista1.add("Iraci");
		lista1.add("Ivone");
		
		Iterator<String> it = lista1.iterator();
		
		while (it.hasNext()) {
			String aux = (String) it.next();
			System.out.println(aux);
		}
	}
		public static void listasFor() {
			ArrayList<String> lista1 = new ArrayList<String>(10);
			lista1.add("João");
			lista1.add("Maria");
			lista1.add("Vera");
			lista1.add("Antonio");
			lista1.add("Alcides");
			lista1.add("Lurdes");
			lista1.add("Madalena");
			lista1.add("Jose");
			lista1.add("Iraci");
			lista1.add("Ivone");
			
			for (String item: lista1) {
				System.out.println(item);
		}
	}
		
}


