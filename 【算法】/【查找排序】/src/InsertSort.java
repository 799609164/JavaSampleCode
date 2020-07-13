import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = insertSortMethod(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }

    private static int[] insertSortMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
