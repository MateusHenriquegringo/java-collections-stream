package src.collections.pessoas;

public class Pessoa implements Comparable<Pessoa>{
	private int idade;
	private double altura;
	private String nome;

	public Pessoa(int idade, double altura, String nome) {
		this.idade = idade;
		this.altura = altura;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public String getNome() {
		return nome;
	}


	@Override
	public int compareTo(Pessoa o) {
		return Integer.compare(this.getIdade(), o.getIdade());
	}
}
