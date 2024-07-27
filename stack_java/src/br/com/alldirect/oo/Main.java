package br.com.alldirect.oo;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		int valores[] = {1,2,3,10};
		stack.push(valores);
		
		stack.exibe();
	}

}
