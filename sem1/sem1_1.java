package sem1;
/*
В консоли запросить имя пользовалетя. В зависимости от текущего времени вывести приветствие, вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59
"Доброй ночи, <Имя>!", если время от 23:00 до 04:59
*/ 

import java.time.LocalTime;
import java.util.Scanner;

public class sem1_1 {
    public static void main(String[] args){
        ex1();
    }

    public static void ex1(){
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        scanner.close();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        String res = "";
        if (hour >= 5 && hour <12) res += "Доброе утро, ";
        else if (hour >=12  && hour <18) res += "Добрый день, ";
        else if (hour >= 18 && hour <23) res += "Добрый вечер, ";
        else res += "Доброй ночи, %s";

        System.out.println(res + name + "!");
    }
}