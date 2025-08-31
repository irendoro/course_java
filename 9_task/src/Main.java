import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть положительным!");
            return;
        }

        double[] array = new double[size];
        double sum = 0;

        System.out.println("Введите " + size + " чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        double average = sum / size;

        System.out.println("Результат умножения каждого элемента на среднее:");
        for (int i = 0; i < size; i++) {
            double multiplied = array[i] * average;
            System.out.printf("array[%d] = %.2f * %.2f = %.2f%n", i, array[i], average, multiplied);
        }

        scanner.close();
    }
}