package Lesson_5.Figure_with_defaul_methods;

public class Circle_without_default implements Figure_without_default {
	private final String name = "Circle";
	private float r;
	private String backgroundColor;
	private String borderСolor;

	public Circle_without_default(float r, String backgroundColor, String borderСolor) {
		this.r = r;
		this.backgroundColor = backgroundColor;
		this.borderСolor = borderСolor;
	}

	@Override
	public float area() {
		return (float) (Math.PI * r * r);
	}

	@Override
	public float perimetr() {
		return (float) (2 * Math.PI * r);
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
