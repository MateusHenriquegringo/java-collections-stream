package src.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	Set<Convidado> convidados;
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();

	}

	void adicionarConvidado(String nome, int codgo){
		convidados.add(new Convidado(nome,codgo));
	}

	void removerConvidado(int codigo){
		for(Convidado c : convidados){
			if(c.getCodigoConvite()==codigo){
				convidados.remove(c);
				break;
			}
		}
	}

	void verificaConvidado(int codigo){
		for(Convidado c : convidados){
			if (c.getCodigoConvite()==codigo){
				System.out.println("Esta convidado");
			} else {
				System.out.println("nao esta convidado");
			}
		}
	}

	public static void main(String[] args) {
		ConjuntoConvidados aniversario = new ConjuntoConvidados();
		aniversario.adicionarConvidado("Mateus", 25);
		aniversario.adicionarConvidado("dan", 12);
		aniversario.adicionarConvidado("joao",12);
		for (Convidado c : aniversario.convidados){
			System.out.println(c);
		};
	}
}
