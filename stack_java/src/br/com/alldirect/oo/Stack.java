package br.com.alldirect.oo;

public class Stack {
	
	private int[] pilha;
	
	public Stack(int tamanhoPilha) {
		pilha = new int[tamanhoPilha];
	}
	
	public void push(int[] elemento) {
		for(int i = 0; i<pilha.length; i++) {
			pilha[i] = elemento[i];
		}
		
	}
	
	public void exibe() {
		for(int i : pilha) {
			System.out.print("["+ i + "]");
			
		}
		System.out.println();
	}
}
