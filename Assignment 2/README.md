# Write a Java program to swap two numbers using third variable

## My Solution

```java
public class SwapTwoNumbers {
    public static void main(String [] args) {
        int firstNum = 1, secondNum = 2, tmp = 0;

        tmp = secondNum;

        secondNum = firstNum;

        firstNum = tmp;

        System.out.println("First Number = " + firstNum + ", Second Number = " + secondNum);
    }
}
```

---

## Output

```plaintext
First Number = 2, Second Number = 1
```