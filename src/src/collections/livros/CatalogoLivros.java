package src.collections.livros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {
	List<Livro> catalogo = new ArrayList<Livro>();

	public static void main(String[] args) {
		CatalogoLivros meuCatalogo = new CatalogoLivros();
		meuCatalogo.adicionarLivro("carl sagan", "cosmos", 1994);
		meuCatalogo.adicionarLivro("carl sagan", "mundo assombrado por demonios", 1992);
		meuCatalogo.adicionarLivro("steve jobs", "biografia", 2005);
		meuCatalogo.ordenarPorAnoDePublicacao();
		for (Livro l : meuCatalogo.catalogo) {
			System.out.println(l.getAnoDePublicacao());
		}
		meuCatalogo.pesquisarPorIntervaloDeAno(1991, 1993).forEach(livro -> System.out.println(livro.getTitulo()));
		meuCatalogo.ordenarPorOrdemAlfabetica();
		for (Livro l : meuCatalogo.catalogo) {
			System.out.println(l.getTitulo());
		}
	}

	public void adicionarLivro(String autor, String nome, int data) {
		this.catalogo.add(new Livro(autor, nome, data));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> retorno = new ArrayList<>();
		for (Livro l : catalogo) {
			if (l.getAutor().equalsIgnoreCase(autor)) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	public List<Livro> pesquisarPorIntervaloDeAno(int inicio, int fim) {
		List<Livro> retorno = new ArrayList<>();
		for (Livro l : catalogo) {
			if (l.getAnoDePublicacao() > inicio && l.getAnoDePublicacao() < fim) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	public Livro pesquisaPorTitulo(String titulo) {
		for (Livro l : catalogo) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				return l;
			}
		}
		return null;
	}

	public void ordenarPorAnoDePublicacao() {
		Collections.sort(catalogo);
	}

	public void ordenarPorOrdemAlfabetica() {
		catalogo.sort(new Comparator());
	}
}
