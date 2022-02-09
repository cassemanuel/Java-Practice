package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> list = new ArrayList<>();

	public void addValue(Integer value) {
		list.add(value);
	}

	// retorna o primeiro elemento na lista
	public Integer first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty"); // programação defensiva
		}
		return list.get(0);
	}

	// para imprimir a lista
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}