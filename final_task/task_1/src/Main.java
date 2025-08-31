import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Количество рублей: ");
        double rubles = scanner.nextDouble();

        double dollars = rubles / exchangeRate;

        double roundedDollars = Math.round(dollars * 100.0) / 100.0;

        System.out.println("Итого: " + roundedDollars + " долларов");

        scanner.close();
    }
}