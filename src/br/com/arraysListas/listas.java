package br.com.arraysListas;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class listas {
	
	public static void listass() {
		
		List<String> minhaLista = new ArrayList<>();
		ArrayList<String> outraa = new ArrayList<>();
		ArrayList<String> lista1 = new ArrayList<String>(10);
		minhaLista.add("João");
		minhaLista.add("Maria");
		minhaLista.add("Vera");
		minhaLista.add("Antonio");
		minhaLista.add("Alcides");
		minhaLista.add("Lurdes");
		minhaLista.add("Madalena");
		minhaLista.add("Jose");
		minhaLista.add("Iraci");
		minhaLista.add("Ivone");
		
		Iterator<String> it = minhaLista.iterator();
		
		while (it.hasNext()) {
			String aux = (String) it.next();
			System.out.println(aux);
		}
	}
		public static void listasFor() {
			List<String> nomedalista = new ArrayList<>();
			nomedalista.add("João");
			nomedalista.add("Maria");
			nomedalista.add("Vera");
			nomedalista.add("Antonio");
			nomedalista.add("Alcides");
			nomedalista.add("Lurdes");
			nomedalista.add("Madalena");
			nomedalista.add("Jose");
			nomedalista.add("Iraci");
			nomedalista.add("Ivone");
			
			for (String item: nomedalista) {
				System.out.println(item);
		}
	}
		
}


