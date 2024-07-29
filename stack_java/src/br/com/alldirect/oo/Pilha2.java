package br.com.alldirect.oo;

public class Pilha2 {
	
	private int topo;
	private int[] pilha;
	
	public Pilha2(int tamanho) {
		this.topo = -1; // comeca negativo para sabermos que a pilha está vazia
		this.pilha = new int[tamanho];
	}
	
	public boolean isEmpty() {
		return this.topo == -1;
	}
	
	public void adicionar(int elemento) {
		if(this.topo == this.pilha.length -1) {
			throw new StackOverflowError("A pilha está estourada");
		}
		
		this.pilha[++topo] = elemento;
	}

}
