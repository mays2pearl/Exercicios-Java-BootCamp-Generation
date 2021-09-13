package ExerciciosJavaBootCampGeneration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		
	List <Integer> minhaLista = new ArrayList <Integer>(); //Integer indica array de elementos tipos inteiro

	minhaLista.add(2);
	minhaLista.add(1);
	minhaLista.add(2);
	minhaLista.add(1);
	minhaLista.add(3);
	
	for(Integer listaElementos: minhaLista) {
		
		System.out.println("Lista Elementos: "+listaElementos);
		
		
	}
	
	System.out.println("\nRemovendo um elemento da lista...");
	
	System.out.println(); //pra limpar cache
	
	minhaLista.remove(0);
	
	for(Integer listaElementos: minhaLista) {
		
		System.out.println("Lista Elementos: "+listaElementos);
		
		
	}
	
	int primeiroElemento = minhaLista.get(0);
	
	System.out.println("O primeiro elemento é : "+primeiroElemento);
	System.out.println();
	
	for (int i=0;i<minhaLista.size();i++) { //no size ele puxa o tamanho da lista
		
		System.out.println("\nElementos: "+minhaLista.get(i));
		
	}
	
	Collections.sort(minhaLista); //colocando a lista em ordem crescente
	
	System.out.println("\nDepois de ordenada a lista");
	
	System.out.println(minhaLista);
	
	System.out.println();
	
	Set <Integer> meuSet = new HashSet <Integer> ();
	
	meuSet.add(3);
	meuSet.add(2);
	meuSet.add(1);
	meuSet.add(3);
	meuSet.add(2);
	
	Iterator <Integer> iMeuSet = meuSet.iterator();//interface que ordena os elementos da lista de inteiros
	
	while(iMeuSet.hasNext()){ //percorre todos os elementos da lista
		
		System.out.println(iMeuSet.next()); //imprime os elementos da lista
		
		
	}
	
	}

}
