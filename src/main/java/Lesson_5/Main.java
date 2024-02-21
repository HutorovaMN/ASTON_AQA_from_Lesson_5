package Lesson_5;

/*Создать классы Собака и Кот с наследованием от класса Животное. 

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. 
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.'); 

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). 

Добавить подсчет созданных котов, собак и животных.*/
public class Main {

	public static void main(String[] args) {

		Animal[] animals = new Animal[7];
		animals[0] = new Cat("кот", "Мурза", 150);
		animals[1] = new Cat("кот", "Шарик", 130);
		animals[2] = new Cat("кот", "Снежок", 50);
		animals[3] = new Dog("собака", "Рэкс", 434, 6);
		animals[4] = new Dog("собака", "Лорд", 432, 10);
		animals[5] = new Dog("собака", "Нэйс", 500, 8);
		animals[6] = new Dog("собака", "Дэнмби", 300, 7);

		System.out.println("Всего животных создано: " + Animal.getCount());
		System.out.println();
		System.out.println("Из них котов: " + Cat.getCount());
		System.out.println();
		System.out.println("Из них собак: " + Dog.getCount());
		System.out.println();

		System.out.println("Животные участвуют в забеге:");
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println("Проверка животных: ");
		System.out.println("Бег: ");
		System.out.println("---------------------------------------------------------------------------------------");

		for (int i = 0; i < animals.length; i++) {
			animals[i].run(120);
		}

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Плавание: ");
		System.out.println("---------------------------------------------------------------------------------------");

		for (int i = 0; i < animals.length; i++) {
			animals[i].swim(7);
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Питание: ");
		System.out.println("---------------------------------------------------------------------------------------");

		Cat[] cats = new Cat[3];
		cats[0] = new Cat("Мурза", 23);
		cats[1] = new Cat("Шарик", 63);
		cats[2] = new Cat("Снежок", 13);

		Bowl bowl = new Bowl(30);
		bowl.addFood(10);
		for (int i = 0; i < cats.length; i++) {
			if (bowl.eatFood(cats[i].satiety) == true) {
				System.out.println("Кот по кличке " + cats[i].name + " " + cats[i].satiety + " - сыт.");
			} else
				System.out.println(
						"Кот по кличке " + cats[i].name + " голоден, в миске нет достаточного количества еды.");
		}

	}
}
