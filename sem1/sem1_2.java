package sem1;

/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1] ,
 * вывести максимальное количество подряд идущих единиц.
 */
public class sem1_2 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,0,1,1,1};
        int count = ex2(array);
        System.out.println(count);
    }

    public static int ex2(int[] arr){
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count +=1;
            else {
                if (max_count < count){
                    max_count = count;
                }
                count = 0;
            };   
        }
        if (max_count < count){
            max_count = count;
        }
        return max_count;

    }
}
