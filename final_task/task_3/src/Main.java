import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        String maxUniqueString = lines[0];
        int maxCount = countUniqueCharacters(lines[0]);

        for (int i = 1; i < n; i++) {
            int currentCount = countUniqueCharacters(lines[i]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxUniqueString = lines[i];
            }
        }

        System.out.println("Ответ: " + maxUniqueString);
        scanner.close();
    }

    private static int countUniqueCharacters(String str) {
        boolean[] encountered = new boolean[Character.MAX_VALUE + 1];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!encountered[c]) {
                encountered[c] = true;
                count++;
            }
        }

        return count;
    }
}