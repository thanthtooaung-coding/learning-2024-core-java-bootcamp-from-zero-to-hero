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