package src.collections.map.produto;

public class Main {
	public static void main(String[] args) {
		EstoqueProdutos meuEstoque = new EstoqueProdutos();
		meuEstoque.adicionarProduto(99990000, "camiseta", 2, 40.0);
		meuEstoque.adicionarProduto(77790000, "casaco", 1, 70.0);

		meuEstoque.exibirProdutos();
	}
}
