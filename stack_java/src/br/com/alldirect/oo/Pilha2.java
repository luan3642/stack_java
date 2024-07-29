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
		if (this.topo == this.pilha.length - 1) {
			throw new StackOverflowError("A pilha está estourada");
		}

		this.pilha[++topo] = elemento;
	}

	public void exibirPilha() {
		System.out.print("[");
		for (int i = 0; i<=topo; i++) {
			System.out.print(pilha[i]);
			if (i != topo ) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		Pilha2 pilha2 = new Pilha2(5);
		
		pilha2.adicionar(4);
		pilha2.adicionar(3);
		
		System.out.println("a pilha está vazia?"+pilha2.isEmpty());
		pilha2.exibirPilha();
	}

}
