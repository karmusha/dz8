package lec;
/**
 * program
 */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class lec1 {
    public static void main(String[] args) throws Exception {
        System.out.println("hi karma");
        System.out.println("text2");
        int a = 1;
        a = a-- - --a;
        System.out.println(a);
        a = --a - a--;
        System.out.println(a);

        // Получение данных из терминала
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.nextLine();
        System.out.printf("int a: ");
        // Проверка на соотвествие получаемого типа
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);       
        int x = iScanner.nextInt();        
        System.out.println(x);       
        // далее
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y); // 4 + 5,000000 = 9,000000
        // iScanner.close();

        // Форматированный вывод
        int aa = 1, b = 2;
        int c = aa + b;
        String res = String.format("%d + %d = %d \n", aa, b, c);
        System.out.printf("%d + %d = %d \n", aa, b, c);
        System.out.println(res);

        // Виды спецификаторов
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00

        // Функции => методы
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        // Управляющие конструкции: условный оператор
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

        if (a > b) c = a;
        if (b > a) c = b;

        // Управляющие конструкции: тернарный оператор
        int min = a < b ? a : b;
        System.out.println(min);

        // Оператор выбора
        // Scanner iScanner = new Scanner(System.in);
        int mounth = iScanner.nextInt();
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
		    case 2:
            case 3:
            case 4:
                text = "Summer";
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();

        // Цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        // Цикл do while
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        // Цикл for
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        // Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // Работает только с коллекциями:
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        // Работа с файлами
        // import java.io.FileWriter;
        // import java.io.IOException;
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // import java.io.*;

        FileReader fr = new FileReader("file.txt");
        int cc;
        while ((cc = fr.read()) != -1) {
            char ch = (char) cc;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();

        // Вариант построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
    
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }  
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
}