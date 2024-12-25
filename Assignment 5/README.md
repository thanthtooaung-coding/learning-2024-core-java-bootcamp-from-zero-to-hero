# Write a Java Program to Count Number of Vowels in a String

## My Solution

```java
import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string \"" + input + "\": " + vowelCount);
        scanner.close();
    }
}
```

---

## Output

```plaintext
Enter a string: Apple
Number of vowels in the string "apple": 2
```