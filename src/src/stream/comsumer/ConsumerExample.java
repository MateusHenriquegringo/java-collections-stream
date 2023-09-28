package src.stream.comsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		//desafio 1
		List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

		//desafio 2 soma dos pares
		System.out.println(numeros.stream().filter(n -> n%2 == 0).reduce(0,Integer::sum));

		//desafio 3 verificar positivos;
		System.out.println(numeros.stream().allMatch(n ->n > 0));

		//desafio 4 remover os impares
		List<Integer> semImpares = numeros.stream().filter(n -> n%2 == 0).toList();
		System.out.println(semImpares);

		//desafio 5 media dos valores maiores que 5
		BinaryOperator<Integer> soma = Integer::sum;
		System.out.println(numeros.stream().filter(n->n>5).mapToDouble(Integer :: doubleValue).average());

		//desafio 6 verificar se contem numero 10
		System.out.println(numeros.stream().anyMatch(n -> n==10));

		//desafio 7 encontrar o segundo maior da lista
		System.out.println(numeros.stream().distinct().sorted((a,b)-> b-a).toList().get(1));

		//desafio 8 somar todos os digitos
		System.out.println(numeros.stream().flatMapToInt(n -> String.valueOf(n).chars()).map(Character::getNumericValue).sum());

		//desafio 9 verificar se todos sao distintos
		System.out.println(numeros.stream().distinct().count() == numeros.size());

		//desafio 10 agrupar os multiploos de 3 e 5
		List<Integer> multiplosde3e5 = numeros.stream().filter(n -> n%3 ==0 | n%5 == 0).toList();
		System.out.println(multiplosde3e5);

		//desafio 11 soma de todos os quadrados
		System.out.println(numeros.stream().map(n -> n*n).reduce(0, Integer::sum));

		//desafio 12 filtrar numero dentro de um intervalo
		System.out.println(numeros.stream().filter(n -> n > 5 && n < 10).toList());


	}
}
