package dz1;

// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class dz1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        boolean flag = scanner.hasNextInt();
        if (flag == false){
            System.out.println("Вы ввели не целочисленное число.");
        }
        int n  = scanner.nextInt(); 
        scanner.close();
        int mult = dz2(n);
        System.out.printf("произведение чисел от 1 до %d = %d.", n, mult);
    }

    public static int dz2(int n){
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        return mult;
    }
} 
