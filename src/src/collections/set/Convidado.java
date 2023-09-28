package src.collections.set;

import java.util.Objects;

public class Convidado {
	private final String nome;
	private final int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Convidado convidado)) return false;
		return getCodigoConvite() == convidado.getCodigoConvite();
	}


	@Override
	public int hashCode() {
		return Objects.hash(getCodigoConvite());
	}

	@Override
	public String toString() {
		return "Convidado{" +
				"nome='" + nome + '\'' +
				", codigoConvite=" + codigoConvite +
				'}';
	}
	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}
}