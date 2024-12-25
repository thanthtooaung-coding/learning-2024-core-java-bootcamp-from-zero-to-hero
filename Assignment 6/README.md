# Write a Java Program to check whether a given string is palindrome or not ?

## My Solution

```java
ipublic class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        input = input.toLowerCase();
        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}
```

---

## Output

```plaintext
The string "madam" is a palindrome.
```