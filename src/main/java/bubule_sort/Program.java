package bubule_sort;

class Program {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        boolean finished = false;
        int last = 0;
        while (!finished) {
            int swaps = 0;
            for (int i = 0; i < array.length - 1 - last; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                }
            }
            last++;
            if (swaps == 0) {
                finished = true;
            }
        }

        return array;
    }
}
