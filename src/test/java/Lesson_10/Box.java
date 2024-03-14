package Lesson_10;

import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> fruits = new ArrayList<>();

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(Fruit fruit) {
        if (fruits.size() > 1 && !isProductsComparable(fruit)) {
            System.out.println("Cannot be added to the box");
        }
        fruits.add(fruit);
    }

    public double getWeight() {
        double sumWeightFruits = 0.0f;
        for (Fruit e : fruits) {
            sumWeightFruits += e.getWeight();
        }
        return sumWeightFruits;
    }

    public ArrayList<Fruit> getProduct() {
        return fruits;
    }


    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }


    public void shiftSingleItem(Box box) {
        if (!isProductsComparable(box)) {
            System.out.println("Mixing of goods is prohibited");
        } else {
            for (int i = fruits.size() - 1; i >= 0; i--) {
                box.getProduct().add(fruits.get(i));
                fruits.remove(i);
            }
        }
    }

    public boolean isProductsComparable(Box box) {
        return this.getProduct().get(0).getClass().equals(box.getProduct().get(0).getClass());
    }

    public boolean isProductsComparable(Fruit fruit) {
        return this.getProduct().get(0).getClass().equals(fruit.getClass());
    }
}