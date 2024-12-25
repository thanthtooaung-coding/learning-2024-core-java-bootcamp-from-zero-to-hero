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
                scanner.close();
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