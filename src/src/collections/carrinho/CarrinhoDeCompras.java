package src.collections.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	double valorTotal = 0;
	List<Item> meuCarrinho;

	public CarrinhoDeCompras() {
		meuCarrinho = new ArrayList<>();
	}

	public static void main(String[] args) {
		CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
		novoCarrinho.adicionarItem("bolacha", 4.0, 3);
		novoCarrinho.adicionarItem("acucar", 2, 2);
		novoCarrinho.removerItem("bolacha");
		System.out.println(novoCarrinho.getValorTotal());

	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		meuCarrinho.add(new Item(quantidade, preco, nome));
	}

	public void removerItem(String nome) {
		meuCarrinho.removeIf(i -> i.nome.equalsIgnoreCase(nome));
	}

	public double getValorTotal() {
		calculaValorTotal();
		return valorTotal;
	}

	public void calculaValorTotal() {
		for (Item i : meuCarrinho) {
			if (i.getQuantidade() > 1) {
				valorTotal += i.getPreco() * i.getQuantidade();
			} else {
				valorTotal += i.getPreco();
			}
		}
	}

	public void exibirItens() {
		for (Item i : meuCarrinho) {
			System.out.println(i.getNome());
		}
	}
}
