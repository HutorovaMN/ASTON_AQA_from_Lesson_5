package Lesson_5.Figure_with_defaul_methods;

/*Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник. 
Задать для каждой фигуры цвет заливки и цвет границы. 
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль. 
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.*/
public interface Figure {

	public void setBackgroundColor(String color);

	public void setBorderСolor(String color);

	public default float areaRectangle(float a, float b) {
		return a * b;
	}

	public default float perimetrRectangle(float a, float b) {
		return 2 * (a + b);
	}

	public default float areaTriangle(float a, float b, float c) {
		float p = (a + b + c) / 2;
		return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public default float perimetrTriangle(float a, float b, float c) {
		return (a + b + c) / 2;
	}

	public default float areaCircle(float r) {
		return (float) (Math.PI * r * r);
	}

	public default float perimetrCircle(float r) {
		return (float) (2 * Math.PI * r);
	}

}
