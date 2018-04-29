package br.com.s2.main;

import br.com.s2.pojo.Node;

public class Principal {

	public static void main(String[] args) {
		Node node = new Node(10);
		node.inserir(20);
		node.inserir(5);
		node.inserir(3);
		
		System.out.println(node.obterSoma(node));

	}

}
