package Lesson_5.Figure_with_defaul_methods;

public class Rectangle implements Figure {

	float a;
	float b;
	String backgroundColor;
	String BorderСolor;

	public Rectangle(float a, float b, String backgroundColor, String BorderСolor) {
		this.a = a;
		this.b = b;
		this.backgroundColor = backgroundColor;
		this.BorderСolor = BorderСolor;
	}

	@Override
	public void setBackgroundColor(String color) {
		this.backgroundColor = color;
	}

	@Override
	public void setBorderСolor(String color) {
		this.BorderСolor = color;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle backgroundColor = " + backgroundColor + ", borderСolor = " + BorderСolor;
	}

}
