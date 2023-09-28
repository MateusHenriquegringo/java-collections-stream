package src.collections.carrinho;

public class Item {
	int quantidade;
	double preco;
	String nome;

	public Item(int quantidade, double preco, String nome) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}
}
