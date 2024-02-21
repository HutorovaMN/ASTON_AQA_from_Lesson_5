package Lesson_5;

/*Создать классы Собака и Кот с наследованием от класса Животное. 

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. 
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.'); 

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). 

Добавить подсчет созданных котов, собак и животных.*/
public class Cat extends Animal {
	private static int count;
	int satiety;

	public Cat(String type, String name, int run) {
		this.type = type;
		this.name = name;
		if (run < 0 || run > 200) {
			throw new IllegalArgumentException("Кот не может бежать больше 200м");
		}
		this.run = run;
		count++;
	}

	public Cat(String name, int satiety) {
		this.name = name;
		this.satiety = satiety;
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
		System.out.println(this.type + " по кличке " + this.name + " - не умеет плавать (:(:(: ");
	}

	@Override
	public String toString() {
		return "Cat [type=" + type + ", name=" + name + ", run=" + run + "]";
	}

	public String toStringFood() {
		return "Cat [name=" + name + ", satiety=" + satiety + "]";
	}

}
