package src.collections.pessoas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
	List<Pessoa> filaSus = new ArrayList<>();

	void adicionarPessoa(String nome, int idade,double altura){
		filaSus.add(new Pessoa(idade, altura, nome));
	}

	public OrdenacaoPessoas(List<Pessoa> filaSus) {
		this.filaSus = new ArrayList<>();
	}

	void ordenarPorIdade(){

	}
	void ordenarPorAltura(){

	}
	void ordenarOrdemAlfabetica(){

	}
}
