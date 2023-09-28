package src.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private final Map<String, Integer> agenda;

	public AgendaContatos() {
		agenda = new HashMap<>();
	}

	void adicionarContato(String nome, Integer contato) {
		agenda.put(nome, contato);
	}

	void removerContato(String nome) {
		if (!agenda.isEmpty()) {
			agenda.remove(nome);
		}
	}

	void exibirContatos() {
		for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	Integer pesquisarPorNome(String nome) {
		return agenda.get(nome);
	}
}
