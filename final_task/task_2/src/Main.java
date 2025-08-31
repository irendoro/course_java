import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String equation = scanner.nextLine();

        char first = equation.charAt(0);
        char operator = equation.charAt(1);
        char third = equation.charAt(2);
        char equals = equation.charAt(3);
        char fifth = equation.charAt(4);

        double result = 0;

        if (first == 'x') {
            int a = Character.getNumericValue(third);
            int b = Character.getNumericValue(fifth);

            if (operator == '+') {
                result = b - a;
            } else {
                result = b + a;
            }

        } else if (third == 'x') {
            int a = Character.getNumericValue(first);
            int b = Character.getNumericValue(fifth);

            if (operator == '+') {
                result = b - a;
            } else {
                result = a - b;
            }

        } else if (fifth == 'x') {
            int a = Character.getNumericValue(first);
            int b = Character.getNumericValue(third);

            if (operator == '+') {
                result = a + b;
            } else {
                result = a - b;
            }

        }

        System.out.println((int)result);

        scanner.close();
    }
}