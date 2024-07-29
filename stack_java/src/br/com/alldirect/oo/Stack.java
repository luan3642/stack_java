package br.com.alldirect.oo;


public class Stack{
	
	
	private int[] pilha;
	private int topo;
	
	// construtor inicializa a pilha com seu tamanho
	// inicializa o topo como -1 para sabermos que a pilha comeca vazia
	
	public Stack(int tamanho) {
		pilha = new int[tamanho];
		topo = -1;
	}
	
	// metodo de adicionar um elemento no topo da pilha
	public static int push(int elemento) {
		if(topo == pilha.length - 1) {
			throw new StackOverflowError("A pilha está cheia");
		}
		return pilha[++topo] = elemento;
	}
	
	public int peak() {
		if(isEmpty()) {
			throw new IllegalArgumentException("A pilha está vazia");
		}
		return pilha[topo];
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new IllegalArgumentException("A pilha já esta vazia");
		}
		int elementoRemovido = this.pilha[topo];
		this.pilha[topo--] = 0;
		return elementoRemovido;
	}
	
	public void exibePilha() {
		System.out.print("[");
		for(int i = 0; i <topo; i++) {
			System.out.print(pilha[i]);	
			if(i != pilha.length-1) {
				System.out.print(",");
			} 
			
		}
		System.out.print("]");
	}
	
	
	public boolean isFull() {
		return this.pilha.length - 1 == topo;
	}
	public boolean isEmpty() {
		if(this.topo == -1) {
			throw new IllegalArgumentException("já está vazio");
		}
		return this.topo == -1;
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(10);
		stack.push(1);
		
		
		
		
		stack.exibePilha();
		System.out.println();
		System.out.println("topo :"+stack.peak());
		System.out.println("a pilha está vazia? "+stack.isEmpty());
		System.out.println("A pilha está cheia? "+stack.isFull());
		System.out.println("Elemento desimpilhado: "+stack.pop());
		stack.exibePilha();
	}
}