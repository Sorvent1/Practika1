package ru.mirea.simakov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String msg = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Введите размер массива: ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Заполните массив: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum + " Среднее арифметическое: " + sum / array.length);
        sum = 0;
        System.out.println("Задание 2");
        System.out.println("Введите размер массива: ");
        int[] array2 = new int[scanner.nextInt()];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < array2.length; i++){
            array2[i] = scanner.nextInt();
        }
        int count = 0;
        int minn = 100000;
        int maxn = -100000;
        while (count < array2.length){
            sum += array2[count];
            if (minn > array2[count]){
                minn = array2[count];
            }
            if (maxn < array2[count]){
                maxn = array2[count];
            }
            count++;
        }
        System.out.println("Сумма элементов: " + sum + " Минимальное значение: " + minn + " Максимальное значение: " + maxn);
        System.out.println("Задание 3");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Задание 4");
        double sum2 = 0.0;
        double term = 0.0;
        for (int i = 1; i <= 10; i++) {
            term = 1.0 / i;
            sum2 += term;
            System.out.printf("%d\t1/%d\t\t%.5f%n", i, i, term);
        }
        System.out.println("Задание 5");
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Факториал " + n + " = " + Factorial(n));
    }

    public static long Factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}