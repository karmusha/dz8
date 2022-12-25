package sem1;
/*
 * Реализовать функцию возведения числа а в степень b. a, b из z. (целочисленные)
 * Сводя количество действий к минимуму.
 * Пример 1: a = 3, b = 2, ответ: 9
 * Пример 1: a = 2, b = -2, ответ: 0.25
 * Пример 1: a = 3, b = 0, ответ: 1
 */

import java.util.Scanner;

public class sem1_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число а: ");
        // Проверка на соотвествие получаемого типа
        boolean flag = iScanner.hasNextInt();
        if (flag == false){
            System.out.printf("Вы ввели не целочисленное число а.");
        }
        int a  = iScanner.nextInt();
        
        System.out.printf("Введите степень b, в которую вы хотите возвести число а: ");
        flag = iScanner.hasNextInt();
        if (flag == false){
            System.out.printf("Вы ввели не целочисленное число b.");
        }
        int b  = iScanner.nextInt();
        iScanner.close();

        System.out.println(ex4(a, b));
    }

    public static double ex4(int a, int b){
        if (b == 0) return 1;
        if (a == 0 || a == 1) return a;
        double a1 = a;
        double res = 1;
        if (b < 0){
            b = -b;
            a1 = 1 / a1; // or a1 = 1.0 / a
        }
        for (int i = 0; i < b; i++) {
            res *= a1;
        }
        
        return res;
    }
}
