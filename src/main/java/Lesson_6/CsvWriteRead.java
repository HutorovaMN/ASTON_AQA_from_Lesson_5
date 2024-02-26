package Lesson_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CsvWriteRead {
	/*
	 * 1.
	 * 
	 * Реализовать сохранение данных в csv файл; 2.
	 * 
	 * Реализовать загрузку данных из csv файла. Файл читается целиком.
	 * 
	 * 
	 * Структура csv файла: Строка заголовок с набором столбцов Набор строк с
	 * целочисленными значениями Разделитель между столбцами - символ точка с
	 * запятой (;)
	 */
	public static void main(String[] args) {
		AppData data = new AppData();
		saveArrayToFile(data, "c:\\Lesson_6.csv"); // сохраняем в файл
		data = loadArrayFromFile("c:\\Lesson_6.csv"); // читаем из файла в
		data.toStringAppData();
	}

	private static void saveArrayToFile(AppData data, String path) {
		try {
			FileWriter writer = new FileWriter("c:\\Lesson_6.csv");
			writer.write(String.join(";", data.getHeader()));
			writer.write("\n");
			for (int[] i : data.getData()) {
				for (int j : i) {
					writer.write(Integer.toString(j));
					writer.write(";");
				}
				writer.write("\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static AppData loadArrayFromFile(String path) {
		AppData data = new AppData();
		try (BufferedReader reader = new BufferedReader(new FileReader("c:\\Lesson_6.csv"))) {
			String headerLine = reader.readLine();
			String[] header = headerLine.split(";");
			data.setHeader(header);
			String str;
			int[][] array = new int[data.getData().length][header.length];
			int index = 0;
			while ((str = reader.readLine()) != null) {
				String[] str2 = str.split(";");
				int[] row = new int[str2.length];
				for (int i = 0; i < str2.length; i++) {
					row[i] = Integer.parseInt(str2[i]);
					array[index][i] = row[i];
				}
				index++;
			}

			data.setData(array);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}