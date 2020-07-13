import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = quickSortMethod(arr,0, arr.length-1);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }

    private static int[] quickSortMethod(int[] arr, int start, int end) {
        int s = start;
        int e = end;
        int key = arr[s];

        while( s < e) {
            // 从后往前查找比基准数小的第一个元素值
            while( s<e && arr[e]>=key) e--;
            if(arr[e] <= key) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }

            // 从前往后查找比基准数大的第一个元素值
            while( s<e && arr[s]<=key) s++;
            if(arr[s] >=key ) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        if(s > start) quickSortMethod(arr, start, s-1);
        if(e < end) quickSortMethod(arr, e+1, end);
        return arr;
    }

}
