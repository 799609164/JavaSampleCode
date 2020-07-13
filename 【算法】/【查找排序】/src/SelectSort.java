import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = selectSortMethod(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }

    private static int[] selectSortMethod(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
