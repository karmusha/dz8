package sem1;

import java.util.Arrays;

/*
 * Дан массив nums = [3,2,5,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести все эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class sem1_5 {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,5,3};
        int val = 3;
        int[] res = ex5(array, val);
        System.out.println(Arrays.toString(res));
    }

    public static int[] ex5(int[] arr, int val){
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < res.length; i++) {
            if (arr[i] != val){
                res[j++] = arr[i];
            }
        }
        return res;
    }
}
