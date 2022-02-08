package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Input: ");
			int dre;
			dre = sc.nextInt();

			ArrayList<Integer> digitos = new ArrayList<>();
			for (int i = 0; i < 9; i++) {
				digitos.add(dre % 10);
				dre /= 10;
			}

			Collections.reverse(digitos);

			// verificar se os dígitos foram realmente separados
			/*
			 * for (int i = 0; i < digitos.size(); ++i) { if (i < digitos.size() - 1) {
			 * System.out.print(digitos.get(i) + ","); } else {
			 * System.out.println(digitos.get(i) + "."); } }
			 */

			int validadorAno = parte1(digitos);

			// do dígito 3 até o 7 é pra ter limite de 99999
			int digitoVerificador = parte2(digitos);

			if (parte3(digitos) && digitoVerificador >= 1 && digitoVerificador <= 99999) {
				int ano = validadorAno - -1900;
				System.out.println("Output: Matricula valida do ano de " + ano);
			} else {
				System.out.println("Output: Matricula invalida");
			}

		} catch (InputMismatchException e) {
			System.out.println("Voce precisa digitar um DRE valido.");
		}
		sc.close();
	}

	public static Integer parte1(ArrayList<Integer> digitos) {

		int digito1 = digitos.get(0);
		digito1 *= 100;
		int digito2 = digitos.get(1);
		digito2 *= 10;
		int digito3 = digitos.get(2);

		int tresPrimeiros = digito1 + digito2 + digito3;

		return tresPrimeiros;
	}

	public static Integer parte2(ArrayList<Integer> digitos) {

		int digito4 = digitos.get(3);
		digito4 *= 10000;
		int digito5 = digitos.get(4);
		digito5 *= 1000;
		int digito6 = digitos.get(5);
		digito6 *= 100;
		int digito7 = digitos.get(6);
		digito7 *= 10;
		int digito8 = digitos.get(7);

		int cincoSegundos = digito4 + digito5 + digito6 + digito7 + digito8;

		return cincoSegundos;
	}

	public static Boolean parte3(ArrayList<Integer> digitos) {

		int sum = 0;

		for (int i = 3; i < digitos.size() - 1; ++i)
			sum += digitos.get(i);

		double mod = sum / 10.0;
		mod = (int) mod * 10;

		if ((sum -= mod) == digitos.get(8)) {
			return true;
		}
		return false;
	}

}
