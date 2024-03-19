public class Factorial {

    public static void main(String[] args) {
        int number;
        System.out.println("Factorial number 0 = " + factorial(0));
        System.out.println("Factorial number 1 = " + factorial(1));
        System.out.println("Factorial number 5 = " + factorial(5));
    }

    public static long factorial(int number) {
        if (number < 0)
            throw new IllegalArgumentException();
        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result = result * i;
        }
        return result;
    }
}
