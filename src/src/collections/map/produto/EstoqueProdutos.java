package src.collections.map.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	Map<Integer, Produto> estoque;

	public EstoqueProdutos() {
		this.estoque = new HashMap<>();
	}
	void adicionarProduto(int cod, String nome, int quantidade, double preco){
		estoque.put(cod,new Produto(nome, quantidade, preco));
	}
	void exibirProdutos(){
		for (Produto p : estoque.values()){
			System.out.println(p);
		}
	}
	Produto obterMaisCaro(){
		double maiorPreco = Double.MIN_VALUE;
		Produto maisCaro = null;
		for (Produto p : estoque.values()){
			if (p.getPreco()>maiorPreco){
				maisCaro = p;
				maiorPreco = p.getPreco();
			}
		}
		return maisCaro;
	}
	Produto obterMaisBarato(){
		double menorPreco = Double.MAX_VALUE;
		Produto maisBarato = null;
		for (Produto p : estoque.values()){
			if (p.getPreco()<menorPreco){
				maisBarato = p;
				menorPreco = p.getPreco();
			}
		}
		return maisBarato;
	}
	Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
		double maiorPreco = Double.MIN_VALUE;
		Produto maisCaro = null;
		for (Produto p : estoque.values()){
			if (p.getPreco()*p.getQuantidade()>maiorPreco){
				maisCaro = p;
				maiorPreco = p.getPreco()*p.getQuantidade();
			}
		}
		return maisCaro;
	}
}
