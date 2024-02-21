package Lesson_5.Figure_with_defaul_methods;

public class Circle implements Figure {
	float r;
	String backgroundColor;
	String BorderСolor;

	public Circle(float r, String backgroundColor, String BorderСolor) {
		this.r = r;
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

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle backgroundColor = " + backgroundColor + ", borderСolor = " + BorderСolor;
	}

}
