# Problem Statement

In the early part of the 20th century, there was considerable interest in both England and the United States in simplifying the rules used for spelling English words, which has always been a difficult proposition. One suggestion advanced as part of this movement was the removal of all doubled letters from words. If this were done, no one would have to remember that the name of the Stanford student union is spelled “Tresidder,” even though the incorrect spelling “Tressider” occurs at least as often. If double letters were banned, everyone could agree on “Tresider.”

Write a method `removeDoubledLetters` that takes a string as its argument and returns a new string with all doubled letters in the string replaced by a single letter.

For example, if you call `removeDoubledLetters("tresidder")` your method should return the string "tresider".

Similarly, if you call `removeDoubledLetters("bookkeeper")` your method should return "bokeper".

In writing your solution, you should keep in mind the following:

- You do not need to write a complete program. All you need is the definition of the method `removeDoubledLetters` that returns the desired result.
- You may assume that all letters in the string are lower case so that you don’t have to worry about changes in capitalization.
- You may assume that no letter appears more than twice in a row.

---

## My Solution

```java
public class RemoveDoubledLetters {
    public static String removeDoubledLetters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDoubledLetters("tresidder"));
        System.out.println(removeDoubledLetters("bookkeeper"));
        System.out.println(removeDoubledLetters("balloon"));
    }
}
```

---

## Output

```plaintext
tresider
bokeper
balon
```
