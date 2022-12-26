package dz1;
/*
 * Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка. Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */

// import java.util.ArrayList;

public class dz1_3 {
    public static void main(String[] args){
        for (int i = 2; i <= 1000; i++) {
            dz3(i);
        }
    }

    public static void dz3(int i){
        for (int k = 2; k <= i; k++) {
            if (k==i) System.out.println(i);
            if (i % k != 0){
                continue;
            }
            if (i % k == 0){
                return;
            }
        }
    }
} 

