package Lesson_5.Figure_with_defaul_methods;

public class Triangle_without_default implements Figure_without_default {
	private final String name = "Triangle";
	private float a;
	private float b;
	private float c;
	private String backgroundColor;
	private String borderСolor;

	public Triangle_without_default(float a, float b, float c, String backgroundColor, String borderСolor) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.backgroundColor = backgroundColor;
		this.borderСolor = borderСolor;
	}

	@Override
	public float area() {
		float p = (a + b + c) / 2;
		return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public float perimetr() {
		return (a + b + c) / 2;
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
