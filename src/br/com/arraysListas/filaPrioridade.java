package br.com.arraysListas;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class filaPrioridade {

	// fila comum
	public static void listafila() {
		LinkedList<String> filaComum = new LinkedList<>();
		filaComum.add("Geronimo");
		filaComum.add ("Sicero");
		filaComum.add ("Isaltina");
		filaComum.add ("Simone");
		filaComum.add ("Rose");
	
		System.out.println("Fila comum: ");
		while(!filaComum.isEmpty()) {
			System.out.println(filaComum.poll()); 
			// nomelista.pull() Retorna e remove o primeiro elemento da lista.
			// Ele está chamando a primeira pessoa e retirando ela da fila. "No caso a fila andou".
		}
	
		// fila prioridade
		PriorityQueue<pessoaas> filaPrioridade = new PriorityQueue<>();
		
		filaPrioridade.add(new pessoaas("carlos", false));
		filaPrioridade.add(new pessoaas("Ana", true));
		filaPrioridade.add(new pessoaas("Roberto", false));
		
		System.out.println("\nFila de prioridade: ");
		while(!filaPrioridade.isEmpty()) {
			System.out.println(filaPrioridade.poll().nome);
		}
	}
	
	

		
	}
	
class pessoaas implements Comparable<pessoaas>{
	String nome;
	boolean fila;
	pessoaas(String nome, boolean fila) {
		this.nome = nome;
		this.fila = fila;
	}
	
	@Override
	public int compareTo(pessoaas outraPessoa) {
		if (this.fila && !outraPessoa.fila){
			return -1;
		} else if (!this.fila && outraPessoa.fila) {

			return 1;
		}
		return  this.nome.compareTo(outraPessoa.nome);
		
	}

}
