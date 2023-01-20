import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        double[] second = {1.57, 7.654, 9.986};
        int[] third = new int[26];
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] first = new int[3];
        double[] second = {1.57, 7.654, 9.986};
        int[] third = new int[26];
        first[0] = 6;
        first[1] = 9;
        first[2] = 12;
        System.out.println(first[0] + ", " + first[1] + ", " + first[2]);
        for (int i = 0; i < 2; i++) {
            if (i != 2) {
                System.out.print(second[i] + ", ");
            } else
                System.out.print(second[i]);
        }
        System.out.print(second[2]);
        System.out.println();
        third[0] = 12;
        int numberArray = 0;
        int number = third[0];
        while (numberArray < third.length) {
            numberArray = numberArray + 1;
            number = number + 6;
            System.out.print(number + ", ");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] first = new int[3];
        double[] second = {1.57, 7.654, 9.986};
        int[] third = {5, 10, 15};
        first[0] = 6;
        first[1] = 9;
        first[2] = 12;
        System.out.println(first[2] + ", " + first[1] + ", " + first[0]);
        for (int i = 2; i < second.length && i >= 0; i--) {
            if (i != 0) {
                System.out.print(second[i] + ", ");
            } else
                System.out.print(second[i]);
        }
        System.out.println();
        int a = third[0];
        int b = third[1];
        int c = third[2];
        System.out.println(c + ", " + b + ", " + a);

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] first = new int[3];
        first[0] = 6;
        first[1] = 9;
        first[2] = 12;
        // способ 1
        for (int i = 0; i < first.length; i = i + 1) {
            if (first [i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
        }
        System.out.print(Arrays.toString(first));
    }
}