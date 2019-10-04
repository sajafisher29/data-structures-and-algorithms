public class MultiBracketValidation {

    // Browsing resources while in the final coding:
    // https://javadevnotes.com/java-split-string-into-array-of-integers-example
    // https://www.geeksforgeeks.org/regular-expressions-in-java/
    // https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

    public static boolean multiBracketValidation(String input) {
        String originalString = new String(input);
        String[] stringArray = originalString.split("");

        Stack enStack = new Stack();
        Stack deStack = new Stack();

        openRegex = "{+|[+|(+";
        closeRegex = "}+|]+|)+";

        Boolean validation;

        for (char string : stringArray) {
            // Check each character to see if it is a open or close bracket
            // If it is an open bracket push it onto the enStack
            if (String.matches(openRegex)) {enStack.push(String);}
            // If a closing backet is found push it onto the deStack and compare the Stack tops
            if (String.matches(closeRegex)) {
                deStack.push(String);
                // If they match then pop them both and continue in the String
                // If they don't match then return false
                if (enStack.top == deStack.top) {
                    enStack.pop();
                    deStack.pop();
                } else return validation = false;
            }
        }
        // When the end of the string is found check the Stacks
        if (enStack.top == null && deStack.top == null) {
            // If empty return true
            return validation = true;
        } else return validation = false; // If not return false

        return validation;
    }
}
