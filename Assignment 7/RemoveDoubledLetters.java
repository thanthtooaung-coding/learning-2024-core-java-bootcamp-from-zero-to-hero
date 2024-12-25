// Write a Java Method to Remove Doubled Letters from a String
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
