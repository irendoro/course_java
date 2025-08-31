import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("Слова, состоящие только из латиницы:");
        int latinWordCount = 0;

        for (String word : words) {
            if (isLatinWord(word)) {
                System.out.println(word);
                latinWordCount++;
            }
        }

        System.out.println("Количество слов на латинице: " + latinWordCount);

        scanner.close();
    }

    private static boolean isLatinWord(String word) {
        if (word.isEmpty()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                return false;
            }
        }
        return true;
    }
}