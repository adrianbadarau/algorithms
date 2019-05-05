package binary_search;


class Program {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return recursiveSearch(0, array.length - 1, array, target);
    }

    public static int recursiveSearch(int left, int right, int[] array, int target) {
        if (left > right) {
            return -1;
        }
        int half = (left + right) / 2;
        int potential = array[half];
        if (potential == target) {
            return half;
        } else if (target < potential) {
            return recursiveSearch(left, half - 1, array, target);
        } else {
            return recursiveSearch(half + 1, right, array, target);
        }
    }
}