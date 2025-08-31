import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean containsConstant = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                containsConstant = true;
                break;
            }
        }

        if (containsConstant) {
            System.out.println("Данное значение имеется в константах");
        }

        scanner.close();
    }
}