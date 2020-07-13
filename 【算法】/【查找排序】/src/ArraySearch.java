public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,1,3,2,4};
        int index = getGetiIndexByEle(arr, 4);
        System.out.println("查找元素第一次出现的位置为："+index);
    }

    private static int getGetiIndexByEle(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(ele == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

