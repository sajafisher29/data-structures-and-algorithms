package code401challenges.utilities;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiBracketValidation {

    // Browsing resources while in the final coding:
    // https://javadevnotes.com/java-split-string-into-array-of-integers-example
    // https://www.geeksforgeeks.org/regular-expressions-in-java/
    // https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
    // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html
    // https://www.freeformatter.com/java-regex-tester.html#documentation

    public static boolean multiBracketValidation(String input) {
        String originalString = new String(input);
        Boolean validation;

        Stack enStack = new Stack();
        Stack deStack = new Stack();

        Pattern searchOpen = Pattern.compile("\\{|\\[|\\(");
        Pattern searchClose = Pattern.compile("\\}|\\]|\\)");
        Matcher matchOpen = searchOpen.matcher(originalString);
        Matcher matchClose = searchClose.matcher(originalString);

        while (matchOpen.find() && matchClose.find()) {
            // Check each character to see if it is a open or close bracket
            // If it is an open bracket push it onto the enStack
            if (matchOpen.find()) {enStack.push(matchOpen.results());}
            // If a closing backet is found push it onto the deStack and compare the Stack tops
            if (matchClose.find()) {
                deStack.push(matchClose.results());
                // If they match then pop them both and continue in the String
                // If they don't match then return false
                if (enStack == deStack) {
                    enStack.pop();
                    deStack.pop();
                } else return validation = false;
            }
        }

        // When the end of the string is found check the Stacks
        // If empty return true, if not return false
        validation = enStack.empty() && deStack.empty();

        return validation;
    }
}
