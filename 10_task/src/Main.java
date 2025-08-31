import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Ошибка: размерности матрицы должны быть положительными!");
            return;
        }

        double[][] matrix = new double[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Строка " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Первая строка матрицы, умноженная на 3:");
        for (int j = 0; j < cols; j++) {
            double result = matrix[0][j] * 3;
            System.out.print(result + " ");
        }

        scanner.close();
    }
}