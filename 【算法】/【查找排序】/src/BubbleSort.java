import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = bubbleSortMethod(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }

    private static int[] bubbleSortMethod(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
