package insertion_sort;

public class Program {
    public static int[] insertionSort(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return new int[]{};
        }
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(j, j - 1, array);
                j--;
            }
        }

        return array;
    }

    private static void swap(int first, int second, int[] array) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
