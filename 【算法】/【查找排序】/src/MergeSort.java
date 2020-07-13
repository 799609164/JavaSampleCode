import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,1,2,3,6};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = mergeSortMethod(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }

    public static int[] mergeSortMethod(int[] arr) {
        split(arr, 0, arr.length-1);
        return arr;
    }

    // 拆分
    public static void split(int[] arr, int start, int end) {
        // 计算中间索引
        int center = (start + end) / 2;
        if(start < end) {
            split(arr, start, center);
            split(arr, center+1, end);
            merge(arr, start, center, end);
        }
    }

    // 合并
    public static void merge(int[] arr, int start,int center, int end) {
        // 临时数组
        int[] tempArr = new int[end-start+1];
        // 左边数组的起始索引
        int l_s = start;
        // 右边数组的起始索引
        int r_s = center + 1;
        // 临时数组的起始索引
        int index = 0;

        while(l_s <= center && r_s <= end) {
            if(arr[l_s] <= arr[r_s]) {
                tempArr[index] = arr[l_s];
                l_s++;
            } else {
                tempArr[index] = arr[r_s];
                r_s++;
            }
            index++;
        }

        // 处理剩余元素
        while(l_s <= center) {
            tempArr[index] = arr[l_s];
            l_s++;
            index++;
        }
        while(r_s <= end) {
            tempArr[index] = arr[r_s];
            r_s++;
            index++;
        }

        // 将临时数组复制到原数组中
        for(int i=0; i < tempArr.length; i++) {
            arr[i+start] = tempArr[i];
        }
    }
}
