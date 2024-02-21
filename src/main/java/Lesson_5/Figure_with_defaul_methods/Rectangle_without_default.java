package Lesson_5.Figure_with_defaul_methods;

public class Rectangle_without_default implements Figure_without_default {
	private final String name = "Rectangle";
	private float a;
	private float b;
	private String backgroundColor;
	private String borderСolor;

	public Rectangle_without_default(float a, float b, String backgroundColor, String borderСolor) {
		this.a = a;
		this.b = b;
		this.backgroundColor = backgroundColor;
		this.borderСolor = borderСolor;
	}

	@Override
	public float area() {
		return a * b;
	}

	@Override
	public float perimetr() {
		return 2 * (a + b);
	}

	@Override
	public String toString() {

		String info = name;
		info += " perimetr: " + perimetr();
		info += " area: " + area();
		info += " backgroundColor: " + backgroundColor;
		info += " borderСolor: " + borderСolor;
		info += "\n";
		return info;
	}

}
