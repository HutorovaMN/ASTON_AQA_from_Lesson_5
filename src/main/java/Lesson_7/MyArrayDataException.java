package Lesson_7;

public class MyArrayDataException extends Exception {
	public int a;
	public int b;

	public MyArrayDataException(String msg, int a, int b) {
		super(msg);
		this.a = a;
		this.b = b;
	}
}
