
import java.util.*;

public class cf1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nouns:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] nouns = new String[n];
        System.out.println("Enter the nouns:");
        for (int i = 0; i < n; i++) {
            nouns[i] = scanner.nextLine();
        }

        String[] pluralNouns = convertToPlural(nouns);
        System.out.println("Plural forms:");
        for (String pluralNoun : pluralNouns) {
            System.out.println(pluralNoun);
        }
    }

    private static String[] convertToPlural(String[] nouns) {
        String[] pluralNouns = new String[nouns.length];

        for (int i = 0; i < nouns.length; i++) {
            if (nouns[i].endsWith("us")) {
                pluralNouns[i] = nouns[i].substring(0, nouns[i].length() - 2) + "i";
            } else {
                pluralNouns[i] = nouns[i];
            }
        }

        return pluralNouns;
    }

}
