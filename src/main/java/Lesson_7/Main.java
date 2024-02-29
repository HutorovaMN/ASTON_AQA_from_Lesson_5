package Lesson_7;

//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо
//бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива
//преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException –
//с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

public class Main {

	public static void main(String[] args) {

		String[][] array = new String[][] { 
			{ "4", "6", "5", "4" },
			{ "34", "42", "8", "3" },
			{ "1", "3", "2", "1" },
			{ "6", "7", "23", "1" } };
		try {
			int result = sumNumber(array);
			System.out.println(result);
		} catch (MyArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (MyArrayDataException e) {
			System.out.println(e.getMessage());
			System.out.println("Ошибка в : строке = " + e.a + " и столбце = " + e.b);
		}
	}

	public static int sumNumber(String[][] array) throws MyArraySizeException, MyArrayDataException {
		int index = 0;
		if (array.length != 4) {
			throw new MyArraySizeException("Размер массива не соответствует 4 (строки)");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i].length != 4) {
				throw new MyArraySizeException("Размер массива не соответствует 4 (столбцы)");
			}
			for (int j = 0; j < array[i].length; j++) {
				try {
					index += Integer.parseInt(array[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException("Введено не ЧИСЛО", i, j);
				}
			}

		}
		return index;
	}
}
