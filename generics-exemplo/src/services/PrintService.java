package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	/*
	 * agora estamos instanciando uma classe do tipo T qualquer. Letra �
	 * irrelevante, s� temos que seguir usando ela
	 */
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	// retorna o primeiro elemento na lista
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty"); // programa��o defensiva
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