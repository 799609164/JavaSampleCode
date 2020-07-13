public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int index = binarySearchMethod(arr, 4);
        System.out.println("查找元素第一次出现的位置为："+index);
    }

    // 二分查找法前提，数组元素有序
    private static int binarySearchMethod(int[] arr, int ele) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;

        // 当找到待查元素，最小索引与最大索引相等
        while(minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;

            if (ele == arr[midIndex]) {
                return midIndex;
            } else if (ele > arr[midIndex]) {
                minIndex = midIndex + 1;
            } else if (ele < arr[midIndex]) {
                maxIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
