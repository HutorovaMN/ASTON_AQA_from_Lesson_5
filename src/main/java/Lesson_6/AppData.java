package Lesson_6;

import java.util.Arrays;

public class AppData {
	private String[] header = { "Value 1", "Value 2", "Value 3" };
	private int[][] data = { { 100, 200, 123 }, { 300, 400, 500 } };

	public String[] getHeader() {
		return header;
	}

	public void setHeader(String[] header) {
		this.header = header;
	}

	public int[][] getData() {
		return data;
	}

	public void setData(int[][] data) {
		this.data = data;
	}

	public void toStringAppData() {
		System.out.println(Arrays.toString(header));
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
