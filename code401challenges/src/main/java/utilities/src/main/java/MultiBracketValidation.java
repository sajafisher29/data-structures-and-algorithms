public class MultiBracketValidation {

    //Browsing resources while in the final coding:
    //https://javadevnotes.com/java-split-string-into-array-of-integers-example
    //https://www.geeksforgeeks.org/regular-expressions-in-java/
    //

    public static boolean multiBracketValidation(String input) {
        String originalString = new String(input);
        String[] stringArray = originalString.split("");

        Stack enStack = new Stack();
        Stack deStack = new Stack();

        //openRegex = /{+|\[+|\(+/gm
        //closeRegex = /}+|\]+|\)+/gm

        Boolean validation;

        for (String : stringArray) {
            // Check each character to see if it is a open or close bracket
            // If it is an open bracket push it onto the enStack
            // If a closing backet is found push it onto the deStack and compare the Stack tops
            // If they match then pop them both and continue in the String
            // If they don't match then return false
            // When the end of the string is found check the Stacks
            // If empty return true
            // If not return false
        }

        return validation;
    }
    // One thing that has not been addressed is whether a String without brackets returns true
}
