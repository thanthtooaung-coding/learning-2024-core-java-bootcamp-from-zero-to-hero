public class LongestSortedSequence {
    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};

        System.out.println(longestSortedSequence(array1)); // Output: 4
        System.out.println(longestSortedSequence(array2)); // Output: 5
    }
}