package Lesson_5.Figure_with_defaul_methods;

public class Triangle implements Figure {

	float a;
	float b;
	float c;
	String backgroundColor;
	String BorderСolor;

	public Triangle(float a, float b, float c, String backgroundColor, String BorderСolor) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle backgroundColor = " + backgroundColor + ", borderСolor = " + BorderСolor;
	}

}
