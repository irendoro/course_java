import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Заархивированный вирус";
        String hint = "Это что-то связанное с компьютерами и архивами...";

        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У вас есть 3 попытки. Для подсказки введите 'Подсказка' (только на первой попытке)");

        boolean usedHint = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Попытка " + attempt + ": ");
            String userAnswer = scanner.nextLine();

            // Проверка на подсказку
            if (userAnswer.equals("Подсказка")) {
                if (attempt == 1 && !usedHint) {
                    System.out.println("Подсказка: " + hint);
                    usedHint = true;
                    // После подсказки сразу переходим к вводу ответа
                    System.out.print("Попытка " + attempt + " (после подсказки): ");
                    userAnswer = scanner.nextLine();
                } else {
                    System.out.println("Подсказка уже недоступна");
                    attempt--; // Не засчитываем эту попытку
                    continue;
                }
            }

            // Проверка ответа
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                scanner.close();
                return;
            } else {
                if (usedHint) {
                    // Если использовали подсказку и ошиблись - сразу завершаем
                    System.out.println("Обидно, приходи в другой раз");
                    scanner.close();
                    return;
                }

                if (attempt < 3) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }

        scanner.close();
    }
}