# Write a Java Program to Find Largest of Three Numbers

## My Solution

```java
public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 45;
        int num3 = 15;
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }
}
```

---

## Output

```plaintext
The largest number among 25, 45, and 15 is: 45
```