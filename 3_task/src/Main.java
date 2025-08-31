public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        int firstElement = numbers[0];
        int middleElement = numbers[numbers.length / 2];


        int sum = firstElement + middleElement;
        System.out.println("Sum of the first and middle elements: " + sum);
    }
}