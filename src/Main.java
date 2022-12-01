import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sumInMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            sumInMonth += arr[i];
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила "+ sumInMonth+" рублей");

        //Задача 2
        System.out.println("\nЗадача 2");
        int maxExpense = 99_000;
        int minExpense = 201_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i]<minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxExpense+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+minExpense+" рублей");

        //Задача 3
        System.out.println("\nЗадача 3");
        double averageSum = (double) sumInMonth/arr.length;
        System.out.println("Средняя сумма трат в день составила "+ averageSum +" рублей");

        //Задача 4
        System.out.println("\nЗадача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}