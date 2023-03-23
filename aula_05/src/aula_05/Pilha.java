package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		// stack é pilha para armazenar os elementos e métodos para adicionar, remover e acessar elementos//
		pilha.push("Brenda");
		//push é adicionar elementos//
		pilha.push("Guilherme");
		pilha.push("Michelle");
		pilha.push("Gabriel Lopes");
		pilha.push("Katarina");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		pilha.pop();
		System.out.println(pilha);
		
		pilha.push("Reynaldo");
		System.out.println(pilha);
		
		System.out.println(pilha.size());
		//size fala a quantidade de elementos que tem na fila 
		
		System.out.println(pilha.contains("Reynaldo"));
	}

}
