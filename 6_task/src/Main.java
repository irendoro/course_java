import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - грамм");
            int unit = scanner.nextInt();

            System.out.println("Введите число");
            double value = scanner.nextDouble();

            double kg, pound, ounce, gram;

            switch (unit) {
                case 1: // килограммы
                    kg = value;
                    pound = kg * 2.20462;
                    ounce = kg * 35.274;
                    gram = kg * 1000;
                    break;
                case 2: // фунты
                    pound = value;
                    kg = pound / 2.20462;
                    ounce = pound * 16;
                    gram = pound * 453.592;
                    break;
                case 3: // унции
                    ounce = value;
                    kg = ounce / 35.274;
                    pound = ounce / 16;
                    gram = ounce * 28.3495;
                    break;
                case 4: // граммы
                    gram = value;
                    kg = gram / 1000;
                    pound = gram / 453.592;
                    ounce = gram / 28.3495;
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения");
                    return;
            }

            System.out.println("Результат:");
            System.out.println("Килограммы: " + String.format("%.3f", kg));
            System.out.println("Фунты: " + String.format("%.3f", pound));
            System.out.println("Унции: " + String.format("%.3f", ounce));
            System.out.println("Граммы: " + String.format("%.3f", gram));

        } else if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = scanner.nextInt();

            System.out.println("Введите число");
            double value = scanner.nextDouble();

            double meters, miles, yards, feet;

            switch (unit) {
                case 1: // метры
                    meters = value;
                    miles = meters / 1609.34;
                    yards = meters * 1.09361;
                    feet = meters * 3.28084;
                    break;
                case 2: // мили
                    miles = value;
                    meters = miles * 1609.34;
                    yards = miles * 1760;
                    feet = miles * 5280;
                    break;
                case 3: // ярды
                    yards = value;
                    meters = yards / 1.09361;
                    miles = yards / 1760;
                    feet = yards * 3;
                    break;
                case 4: // футы
                    feet = value;
                    meters = feet / 3.28084;
                    miles = feet / 5280;
                    yards = feet / 3;
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения");
                    return;
            }

            System.out.println("Результат:");
            System.out.println("Метры: " + String.format("%.3f", meters));
            System.out.println("Мили: " + String.format("%.6f", miles));
            System.out.println("Ярды: " + String.format("%.3f", yards));
            System.out.println("Футы: " + String.format("%.3f", feet));

        } else {
            System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}