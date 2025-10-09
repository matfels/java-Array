package br.com.arraysListas;

import java.util.ArrayList;
import java.util.Iterator;

public class pessoa {
	private String nome;
	private int idade;
	public ArrayList<pessoa> Lista = new ArrayList<pessoa>(10);
	
	// CONTRUTOR
	public pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;	
	}	

	// GETERS E SETERS 
	public void setnome(String nome) {
		this.nome = nome;	
	}	
	public String getnome() {
		System.out.println("Nome setado: " + nome);
		return nome;
	}
	public void setidade(int idade) {
		this.idade = idade;
		
	}	
	public int getidade() {
		System.out.println("Idade: " + idade);
		return idade;
	}


	public String tostring() {
		return "Pessoa: [nome = " + nome + ", Idade: " + idade + "]";
	}
	
	public void listpessoas(pessoa objeto) {
		Lista.add(objeto);
	//	System.out.println(Lista);
		
	}
	
	public void getpessoas() {
		Iterator<pessoa> it = Lista.iterator();
		while (it.hasNext()) {
		pessoa objeto = it.next();
		System.out.println(objeto.tostring());
		
			
		
		
// fooooooooooor		
//		for (pessoa Item: Lista) {
//			System.out.println(Item);
			
			
		}
	}
}
