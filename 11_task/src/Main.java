import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String firstNumberStr = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        double firstNumber = Double.parseDouble(firstNumberStr);

        double maxNumber = Math.max(firstNumber, secondNumber);
        System.out.println("Большее число: " + maxNumber);

        double minNumber = Math.min(firstNumber, secondNumber);
        System.out.println("Меньшее число (в double): " + minNumber);

        scanner.close();
    }
}