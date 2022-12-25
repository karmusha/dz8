package sem1;

/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */
public class sem1_3{
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        System.out.println(ex3(s));
    }

    public static String ex3(String s){
        String[] arr = s.split(" ");
        String result = "";
        for (int i = arr.length -1; i >=0 ; i--) {
            result += arr[i] + " ";
        }
        return result;
    }
}
