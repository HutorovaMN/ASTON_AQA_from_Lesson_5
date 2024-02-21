package Lesson_5;

/*Создать классы Собака и Кот с наследованием от класса Животное. 
 
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. 
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.'); 

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). 

Добавить подсчет созданных котов, собак и животных.*/
public abstract class Animal {
	String type;
	String name;
	int sw;
	int run;
	private static int count;

	public Animal() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	abstract void run(int distance);

	abstract void swim(int distance);

}
