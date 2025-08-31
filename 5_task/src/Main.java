import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите знак операции: ");
        char op = scanner.next().charAt(0);

        if (op == '+') {
            System.out.println("Результат:" + (a + b));
        } else if (op == '-') {
            System.out.println("Результат:" + (a - b));
        } else if (op == '*') {
            System.out.println("Результат:" + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println("Результат:" + (a / b));
            } else {
                System.out.println("Ошибка: деление на ноль!");
            }
        } else {
            System.out.println("Неизвестная операция!");
        }

        scanner.close();
    }
}