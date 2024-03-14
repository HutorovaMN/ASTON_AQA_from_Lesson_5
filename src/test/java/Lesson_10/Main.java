package Lesson_10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Work starts");
        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("Weight of box No.1: " + box1.getWeight());
        System.out.println("The Box1 stores " + box1.getProduct().get(0).getClass().getSimpleName());
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("Weight of box No.2: " + box2.getWeight());
        System.out.println("The Box2 stores " + box2.getProduct().get(0).getClass().getSimpleName());
        System.out.println("The masses of the box1 and box2 " + (box1.compare(box2) ? "the same" : "different") + ".");
        System.out.println("Comparing apples and oranges : " + box1.isProductsComparable(box2));
        System.out.println("We try to move the apples in oranges from box 1 to box 2");
        box1.shiftSingleItem(box2);
        System.out.println("Weight of box No.1: " + box1.getWeight());
        System.out.println("Weight of box No.2: " + box2.getWeight());
        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("The Box3 stores " + box3.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Weight of box No.3: " + box3.getWeight());
        System.out.println("We moved the apples from box 1 to box 3");
        box1.shiftSingleItem(box3);
        System.out.println("Weight of box No.1: " + box1.getWeight());
        System.out.println("Weight of box No.3: " + box3.getWeight());
        System.out.println("We are trying to add oranges to apples: ");
        box3.add(new Orange());
    }
}

