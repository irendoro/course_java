import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: число должно быть положительным!");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Сумма всех нечетных чисел от 1 до " + n + " равна: " + sum);

        scanner.close();
    }
}