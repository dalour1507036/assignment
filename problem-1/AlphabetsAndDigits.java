import java.util.Arrays;
import java.util.Scanner;

public class AlphabetsAndDigits {
    public void extractAndSortAlphabetsSumDigits() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String alphabets = "";
        int sumOfDigits = 0;

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabets += c;
            } else {
                sumOfDigits += Character.getNumericValue(c);
            }
        }

        char[] charArray = alphabets.toCharArray();
        Arrays.sort(charArray);
        alphabets = new String(charArray);

        System.out.println(alphabets + sumOfDigits);
    }
}
