import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //taskTest1();
        //task5();
        //task6();
        //task7();
        task8();

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
            if (first[i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
        }
        System.out.print(Arrays.toString(first));
    }

    public static void taskTest1() {
        System.out.println("Пробная 1");
        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task6() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int arrMax = -1;
        int arrMin = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + arrMax + " рублей");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей");
    }

    public static void task7() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        int days = 30;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task8() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}


