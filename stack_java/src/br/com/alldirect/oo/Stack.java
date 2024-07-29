package br.com.alldirect.oo;


public class Stack{
	
	
	private static int[] pilha;
	private static int topo;
	
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
		return pilha[topo];
	}
	
	public void exibePilha() {
		System.out.print("[");
		for(int i = 0; i <pilha.length; i++) {
			System.out.print(pilha[i]);	
			if(i != pilha.length-1) {
				System.out.print(",");
			} 
			
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(10);
		
		
		
		stack.exibePilha();
		System.out.println();
		System.out.println("topo :"+stack.peak());

	}
}