package services;

import java.util.List;

public class CalculationService {

	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		Integer max = list.get(0);
		/*
		 * método fácil de pegar o maior elemento de uma lista.
		 * pega o primeiro elemento
		 * da lista (list.get(0)) e compara se cada item dessa lista é maior que o max.
		 * Se o resultado for maior que 0 significa que o primeiro é maior que o
		 * segundo. Ai atualiza o max com o item.
		 */
		for (Integer item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}