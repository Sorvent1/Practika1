package ru.mirea.simakov;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Задание 13");
        printOddIndex(1);

        System.out.println("Задание 14");
        System.out.print("Введите число: ");
        int n14 = scanner.nextInt();
        printDigitsLeft(n14);
        System.out.println();

        System.out.println("Задание 15");
        System.out.print("Введите число: ");
        int n15 = scanner.nextInt();
        printDigitsRight(n15);
        System.out.println();

        System.out.println("Задание 16");
        int[] res = maxAndCount();
        System.out.println("Максимум: " + res[0]);
        System.out.println("Количество: " + res[1]);

        System.out.println("Задание 17");
        int max = findMax();
        System.out.println("Максимум: " + max);
    }

    static void printOddIndex(int pos) {
        int x = scanner.nextInt();
        if (x == 0) return;
        if (pos % 2 == 1) System.out.println(x);
        printOddIndex(pos + 1);
    }

    static void printDigitsLeft(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printDigitsLeft(n / 10);
        System.out.print(n % 10 + " ");
    }

    static void printDigitsRight(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n % 10 + " ");
        printDigitsRight(n / 10);
    }

    static int[] maxAndCount() {
        int x = scanner.nextInt();
        if (x == 0) return new int[]{0, 0};

        int[] next = maxAndCount();

        if (x > next[0]) return new int[]{x, 1};
        if (x == next[0]) return new int[]{next[0], next[1] + 1};
        return next;
    }

    static int findMax() {
        int x = scanner.nextInt();
        if (x == 0) return 0;
        int m = findMax();
        return Math.max(x, m);
    }
}