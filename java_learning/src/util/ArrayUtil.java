package util;

public class ArrayUtil {


    public static void swap(int[] arr, int holdPosition, int swapPosition) {
        int temp = arr[holdPosition];
        arr[holdPosition] = arr[swapPosition];
        arr[swapPosition] = temp;
    }
}
