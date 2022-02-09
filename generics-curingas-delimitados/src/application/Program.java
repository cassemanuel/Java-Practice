package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		/*
		 * ao inv�s de s� ?, extende o Shape pois ai o m�todo aceita percorrer itens da
		 * lista de c�rculos ou retangulos. Ainda sim n�o conseguiremos fazer um list.add
		 */
		double sum = 0.0;
		// percorre a lista vendo os shape e retorna a soma das �reas
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}