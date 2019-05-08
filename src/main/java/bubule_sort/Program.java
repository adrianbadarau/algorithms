package bubule_sort;

class Program {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        boolean finished = false;
        while (!finished) {
            int swaps = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                finished = true;
            }
        }

        return array;
    }
}
