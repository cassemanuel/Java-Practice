package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		// inst�ncia um objeto da classe Random usando o construtor padr�o
		Random gerador = new Random();

		ArrayList<Integer> contador = new ArrayList<>();

		// imprime sequ�ncia de 10 n�meros inteiros aleat�rios
		for (int i = 0; i < 101; i++) {
			contador.add(gerador.nextInt(101)); // o n�mero dentro do parentes fala quantos aleat�rios eu gero e o tipo
												// do next fala qual o tipo de numero
		}
		for (int j = 0; j < contador.size(); j++) {
			if (j < contador.size() - 1) {
				System.out.print(contador.get(j) + ",");
			} else {
				System.out.println(contador.get(j) + ".");
			}
		}
		System.out.println();

		int highestNumber = Collections.max(contador);
		int lowestNumber = Collections.min(contador);

		System.out.println(highestNumber);
		System.out.println(lowestNumber);
	}

}
