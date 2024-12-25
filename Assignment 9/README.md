# Problem Statement

Write a method named `longestSortedSequence` that accepts an array of integers as a parameter and that returns the length of the longest sorted (non-decreasing) sequence of integers in the array.

For example, if a variable named `array` stores the following values:

```java
int[] array1 = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
```

Then the call of `longestSortedSequence(array1)` should return `4` because the longest sorted sequence in the array has four values in it (the sequence `-3, 0, 14, 207`). Notice that sorted means non-decreasing, which means that the sequence could contain duplicates. For example, if the array stores the following values:

```java
int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
```

Then the method would return `5` for the length of the longest sequence (the sequence `3, 5, 5, 5, 8`). Your method should return `0` if passed an empty array. Your method should return `1` if passed an array that is entirely in decreasing order or contains only one element.

Constraints:
- You may not use any auxiliary data structures (arrays, lists, strings, etc.) to solve this problem.
- Your method should not modify the array that is passed in.

---

## My Solution

```java
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
```

---

## Output

For the given examples:

```plaintext
4
5
```