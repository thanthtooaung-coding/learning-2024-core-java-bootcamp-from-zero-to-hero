# Problem Statement

Your task in this program is to write a method neverEndingBirthdayParty that simulates building a group of people one person at a time. Each person is presumed to have a birthday that is randomly chosen from all possible birthdays. Once it becomes the case that each day of the year, someone in your group has a birthday, your program should return the number of people in the group and exit.

In writing your solution, you should assume the following:

• There are 366 possible birthdays (this includes February 29).

• All birthdays are equally likely, including February 29. You might find it useful to represent birthdays as integers between 0 and 365, inclusive.

---

## My Solution

```java
import java.util.HashSet;
import java.util.Random;

public class NeverEndingBirthdayParty {
    
    public static int neverEndingBirthdayParty() {
        int totalDays = 366;

        HashSet<Integer> coveredBirthdays = new HashSet<>();

        int peopleCount = 0;
    
        Random random = new Random();

        while (coveredBirthdays.size() < totalDays) {
            int randomBirthday = random.nextInt(totalDays);
            coveredBirthdays.add(randomBirthday);
            peopleCount++;
        }

        return peopleCount;
    }

    public static void main(String[] args) {
        int result = neverEndingBirthdayParty();
        System.out.println("Number of people needed: " + result);
    }
}
```

---

## Output

The output will vary each time the program is run due to the random nature of assigning birthdays. For example:

```plaintext
Number of people needed: 473
```

In another run:

```plaintext
Number of people needed: 467
```
