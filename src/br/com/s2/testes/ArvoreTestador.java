package br.com.s2.testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.s2.pojo.Node;

public class ArvoreTestador {

		Node node;
		
		@Before
		public void criaUtilNumero() {
			this.node = new Node(10);
		}
		
		@Test
		public void deveInserirElementoNaArvore(){	
			Assert.assertEquals(Boolean.TRUE, Boolean.valueOf(node.inserir(5)));
		}
		
		@Test
		public void deveRetornarSomaNodes(){	
			
			node.inserir(15);
			node.inserir(20);
			node.inserir(100);
			
			Assert.assertEquals(Integer.valueOf(145), node.obterSoma(node));
		}
		
		
		


}
