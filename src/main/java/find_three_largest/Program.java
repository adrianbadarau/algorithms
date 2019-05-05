package find_three_largest;

import java.util.Arrays;

public class Program {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            updateLargest(largest, array[i]);
        }
        return largest;
    }

    public static void updateLargest(int[] largest, int num) {
        for (int i = 2; i >= 0; i--) {
            if (num > largest[i]) {
                shiftArray(largest, num, i);
                return;
            }
        }
    }

    public static void shiftArray(int[] arr, int newItem, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                arr[i] = newItem;
            } else {
                arr[i] = arr[i + 1];
            }
        }
    }
}
