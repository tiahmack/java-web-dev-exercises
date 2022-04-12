package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String staticVariable = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a term to search: ");
        String termSearched = input.nextLine();
        staticVariable.contains("text");
        staticVariable.toLowerCase(Locale.ROOT);
        System.out.println(termSearched + " was found");
        System.out.println(staticVariable);

    }
}