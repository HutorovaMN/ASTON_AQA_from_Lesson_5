package Lesson_5;

/*Создать классы Собака и Кот с наследованием от класса Животное. 

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. 
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.'); 

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). 

Добавить подсчет созданных котов, собак и животных.*/
public class Dog extends Animal {
	private static int count;

	public Dog(String type, String name, int run, int sw) {
		this.type = type;
		this.name = name;
		if (sw < 0 || sw > 10) {
			throw new IllegalArgumentException("Собака не может бежать больше 10м");
		}
		this.sw = sw;
		if (run < 0 || run > 500) {
			throw new IllegalArgumentException("Собака не может бежать больше 500м");
		}
		this.run = run;
		count++;
	}

	public static int getCount() {
		return count;
	}

	@Override
	void run(int distance) {
		if (run >= distance) {
			System.out.println(this.type + " по кличке " + this.name + "  - пробежал - " + run + "м");
		} else {
			System.out.println(this.type + " по кличке " + this.name + " - не смог пробежать (:(:(: ");
		}
	}

	@Override
	void swim(int distance) {
		if (sw >= distance) {
			System.out.println(this.type + " по кличке " + this.name + "  - проплыл - " + sw + "м");
		} else {
			System.out.println(this.type + " по кличке " + this.name + " - не смог проплыть (:(:(: ");
		}

	}

	@Override
	public String toString() {
		return "Dog [type=" + type + ", name=" + name + ", sw=" + sw + ", run=" + run + "]";
	}

}
