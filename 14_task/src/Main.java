import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(41) - 20;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        int maxAbsolute = Math.max(Math.abs(max), Math.abs(min));

        System.out.println("Наибольшее по модулю: " + maxAbsolute);

    }
}