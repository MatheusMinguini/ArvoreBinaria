package br.com.s2.pojo;

import br.com.s2.interfaces.ArvoreBinaria;

public class Node extends ArvoreBinaria{
	public int valor;
	public Node direita;
	public Node esquerda;
	
	public Node(int valor) {
		this.valor = valor;
	}

	public Boolean inserir(int valor) {
		if(valor < this.valor) {
			if(this.esquerda == null) {
				this.esquerda = new Node(valor);
				return true;
			}else {
				this.esquerda.inserir(valor);
			}
		}else {
			if(this.direita == null) {
				this.direita = new Node(valor);
				return true;
			}else {
				this.direita.inserir(valor);
			}
		}	
		
		return false;
	}

	public Boolean contem(int valor) {
		return null;
	}

	public void imprimir() {
		if(esquerda != null) {
			esquerda.imprimir();
		}
		
		System.out.println(valor);
		
		if(direita != null) {
			direita.imprimir();
		}
		
	}

	@Override
	public Integer obterSoma(Node node) {
		int soma;
		if(node != null){
		   soma = obterSoma(node.direita) + obterSoma(node.esquerda) + node.valor;
		   return soma;
		}else {
			return 0;
		}
	}
}
