package src.collections.livros;

public class Comparator implements java.util.Comparator<Livro> {
	@Override
	public int compare(Livro o1, Livro o2) {
		return String.CASE_INSENSITIVE_ORDER.compare(o1.getTitulo(), o2.getTitulo());
	}
}
