package src.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> minhasTarefas;

	public ListaTarefas() {
		this.minhasTarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String desc) {
		this.minhasTarefas.add(new Tarefa(desc));
	}

	public void removerTarefa(String desc) {
		List<Tarefa> tarefaRemover = new ArrayList<>();
		for (Tarefa t : minhasTarefas){
			if (t.getDescricao().equalsIgnoreCase(desc)) {
				tarefaRemover.add(t);
			}
		}
		minhasTarefas.removeAll(tarefaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return this.minhasTarefas.size();
	}

	public void obterDescricoesTarefas() {
		for(Tarefa t : minhasTarefas){
			System.out.println( t.getDescricao());
		}

	}

	public static void main(String[] args) {
		ListaTarefas minhaLista = new ListaTarefas();
		minhaLista.adicionarTarefa("lavar o carro");

		minhaLista.adicionarTarefa("lavar a casa");
		minhaLista.obterDescricoesTarefas();
	}
}
