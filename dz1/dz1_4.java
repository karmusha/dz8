package dz1;
// Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")

import java.util.Scanner;

public class dz1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        boolean flag = scanner.hasNextDouble();
        if (flag == false) System.out.printf("Вы ввели не число.");
        double a  = scanner.nextDouble();
        
        System.out.printf("Введите второе число: ");
        flag = scanner.hasNextDouble();
        if (flag == false) System.out.println("Вы ввели не число.");
        double b  = scanner.nextDouble();

        System.out.println(String.join("\n"
        , "Введите символ действия, которое вы хотите сделать: "
        , "+ - сумма"
        , "- - разница"
        , "* - умножение"
        , "/ - деление"));
        flag = scanner.hasNext();
        if (flag == false) System.out.printf("Что-то пошло не так.");
        char c = scanner.next().charAt(0);
        scanner.close();
        if (c == '+' ^ c == '-'^ c == '*' ^ c == '/') calc(a, b, c);
        else System.out.printf("Вы ввели недопустимый символ.");      
    }

    public static void calc(double a, double b, char c){
        if (c == '+') System.out.println(a+b);
        if (c == '-') System.out.println(a-b);
        if (c == '*') System.out.println(a*b);
        if (c == '/') System.out.println(a/b);
    }  
}
