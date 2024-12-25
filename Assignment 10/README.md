# Problem Statement

Write a program that categorizes grades into letter grades (A, B, C, D, F) and provides statistics about the grades entered by the user. The program should:

1. Prompt the user to enter grades as integers between 0 and 100 or -1 to quit.
2. Categorize the grades into the following letter ranges:
   - **A:** 90 to 100
   - **B:** 80 to 89
   - **C:** 70 to 79
   - **D:** 60 to 69
   - **F:** 0 to 59
3. Store the grades in separate `Vector` objects based on their category.
4. Output the following statistics:
   - Total number of grades entered
   - Count of grades in each category (A, B, C, D, F)
   - A list of all A grades entered

---

## Example Input

```
Please enter a grade between 0 to 100 or -1 to quit:
38
86
92
55
83
42
90
-1
```

## Example Output

```
Total number of grades = 7
Number of A = 2
Number of B = 2
Number of C = 0
Number of D = 0
Number of F = 3
The A grades are: 92, 90
```

---

## Solution

```java
import java.util.Scanner;
import java.util.Vector;

public class GradesCount {
    public static void main(String[] args) {
        Vector<Integer> aGrades = new Vector<>();
        Vector<Integer> bGrades = new Vector<>();
        Vector<Integer> cGrades = new Vector<>();
        Vector<Integer> dGrades = new Vector<>();
        Vector<Integer> fGrades = new Vector<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a grade between 0 to 100 or -1 to quit: ");

        while (true) {
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 to 100 or -1 to quit: ");
                continue;
            }

            if (grade >= 90) {
                aGrades.add(grade);
            } else if (grade >= 80) {
                bGrades.add(grade);
            } else if (grade >= 70) {
                cGrades.add(grade);
            } else if (grade >= 60) {
                dGrades.add(grade);
            } else {
                fGrades.add(grade);
            }
        }

        int totalGrades = aGrades.size() + bGrades.size() + cGrades.size() + dGrades.size() + fGrades.size();
        System.out.println("Total number of grades = " + totalGrades);
        System.out.println("Number of A = " + aGrades.size());
        System.out.println("Number of B = " + bGrades.size());
        System.out.println("Number of C = " + cGrades.size());
        System.out.println("Number of D = " + dGrades.size());
        System.out.println("Number of F = " + fGrades.size());

        System.out.print("The A grades are: ");
        for (int i = 0; i < aGrades.size(); i++) {
            System.out.print(aGrades.get(i));
            if (i < aGrades.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
```

---

## How to Run

1. Copy the code into a file named `GradesCount.java`.
2. Compile the file using `javac GradesCount.java`.
3. Run the program using `java GradesCount`.
4. Enter grades as prompted. Enter `-1` to quit and view the statistics.

---