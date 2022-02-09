package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	// podemos usar o object mas tem agora o problema do type safety
	private List<Object> list = new ArrayList<>();

	public void addValue(Object value) {
		list.add(value);
	}

	// retorna o primeiro elemento na lista
	public Object first() {
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