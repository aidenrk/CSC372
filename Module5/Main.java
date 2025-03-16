import java.util.Scanner;

public class Main {
    public static int Module5(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1;
        }
        return numbers[index] * Module5(numbers, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please enter 5 numbers... (Hit enter after each number.)");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int product = Module5(numbers, 0);
        System.out.println("The product of your numbers is: " + product);
    }
}