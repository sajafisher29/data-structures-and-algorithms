package code401challenges;

import code401challenges.hashtable.Hashtable;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class RepeatedWord {

// Write a function that accepts a lengthy string parameter.
// Without utilizing any of the built-in library methods available, return the first word to occur more than once in that provided string.

// Big thank you to Quang for helping me catch up after being out sick
// Referenced: https://www.geeksforgeeks.org/java-util-stringjoiner-java8/
// Referenced: https://www.javatpoint.com/program-to-find-the-duplicate-words-in-a-string

    public static String repeatedWord(String bookText) {

        // Use the hashtable to store the seen words
        Hashtable seenWordHashTable = new Hashtable();

        // String builder to build each word letter by letter
        StringBuilder word = new StringBuilder();

        // Regex function to match anything that is a letter
        Pattern pattern = Pattern.compile("\\w");

        for (int i = 0; i < bookText.length(); i++) {
            String currentCharacter = bookText.substring(i, i + 1).toLowerCase();

            // Check for space after a special character like period
            if (currentCharacter.equals(" ") && word.length() == 0) {
                continue;
            }

            // If the current character is a letter then append it to the current word
            if (pattern.matcher(currentCharacter).matches()) {
                word.append(currentCharacter);
            } else {
                // Check for apostrophes between words like I'm
                if ((currentCharacter.equals("'") || (currentCharacter.equals("'")) && word.length() > 0)) { // Thank you to Quang for thinking of hyphens!
                    word.append(currentCharacter);
                } else if (seenWordHashTable.contains(word.toString())) {
                    return word.toString();
                    // Check for multiple special characters next to each other
                } else if (word.length() == 0) {
                    continue;
                } else {
                    seenWordHashTable.add(word.toString(), 1);
                    word.delete(0, word.length());
                }
            }
        }
        return null;
    }

    public static String repeatedWords(String bookText) {

        int count;
        StringJoiner repeatedWordsFound = new StringJoiner(" ");

        // Converts the string into lowercase
        String lowerString = bookText.toLowerCase();

        // Split the string into words using built-in function
        String words[] = bookText.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    // Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            // Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0")
                repeatedWordsFound.add(words[i]);
        }
        return repeatedWordsFound.toString();
    }
}