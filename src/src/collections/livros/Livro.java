package src.collections.livros;

public class Livro implements Comparable<Livro>{
	private String titulo,autor;
	private int anoDePublicacao;

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public Livro(String autor, String titulo, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}

	@Override
	public int compareTo(Livro o) {
		return Integer.compare(this.getAnoDePublicacao(),o.getAnoDePublicacao());
	}
}
