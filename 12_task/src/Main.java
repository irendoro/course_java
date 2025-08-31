public class Main {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        if (containsJava && startsWithILike && endsWithExclamation) {
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseString);

            String replacedString = inputString.replace('a', 'o');
            String jovoSubstring = replacedString.substring(7, 11); // "Java" -> "Jovo"
            System.out.println("Подстрока 'Jovo': " + jovoSubstring);
        }
    }
}