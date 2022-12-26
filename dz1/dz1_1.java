package dz1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

public class dz1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        boolean flag = scanner.hasNextInt();
        if (flag == false){
            System.out.println("Вы ввели не целочисленное число.");
        }
        int n  = scanner.nextInt(); 
        scanner.close();
        int sum = dz1(n);
        System.out.printf("Сумма чисел от 1 до %d = %d.", n, sum);
    }

    public static int dz1(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
} 