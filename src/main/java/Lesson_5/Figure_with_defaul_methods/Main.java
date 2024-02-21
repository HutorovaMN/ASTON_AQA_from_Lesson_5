package Lesson_5.Figure_with_defaul_methods;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"1-ый вариант. С дефолтными методами!---------------------------------------------------------");
		System.out.println();

		Rectangle rectangle = new Rectangle(4.7f, 5.5f, "green", "red");
		System.out.println("Rectangle : perimetr = " + rectangle.perimetrRectangle(rectangle.a, rectangle.b)
				+ ", area = " + rectangle.areaRectangle(rectangle.a, rectangle.b) + ", " + rectangle.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		Triangle triangle = new Triangle(5.7f, 5.0f, 7.9f, "orange", "white");
		System.out.println("Triangle perimetr = " + triangle.perimetrTriangle(triangle.a, triangle.b, triangle.c)
				+ ", area = " + triangle.areaTriangle(triangle.a, triangle.b, triangle.c) + ", " + triangle.toString());

		System.out.println(
				"--------------------------------------------------------------------------------------------");

		Circle circle = new Circle(15.7f, "black", "white");
		System.out.println("Circle perimetr = " + circle.perimetrCircle(circle.r) + ", area = "
				+ circle.areaCircle(circle.r) + ", " + circle.toString());

		System.out.println();

		System.out.println(
				"2-ой вариант. Без дефолтных методов!---------------------------------------------------------");
		System.out.println();

		Rectangle_without_default rect = new Rectangle_without_default(5.6f, 4.8f, "green", "gold");
		System.out.println(rect.toString());

		System.out.println(
				"--------------------------------------------------------------------------------------------");
		Circle_without_default circ = new Circle_without_default(9.6f, "black", "pink");
		System.out.println(circ.toString());

		System.out.println(
				"--------------------------------------------------------------------------------------------");
		Triangle_without_default tr = new Triangle_without_default(5.4f, 5.9f, 3.2f, "gold", "pink");
		System.out.println(tr.toString());

	}

}
