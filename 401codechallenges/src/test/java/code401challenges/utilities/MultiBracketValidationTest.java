package code401challenges.utilities;

import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    // I need all the tests!

    @Test
    public void testCorrectOutcomeTrue() {
        String good = "(I am a {@ood} string.)";
        assertTrue(multiBracketValidation(good));
    }

    @Test public void testCorrectOutcomeFalse() {
        String bad = "(I a/m a ba} string.)";
        assertFalse(multiBracketValidation(bad));
    }

    @Test public void testStringWithoutBrackets() {
        String none = "I am a @ood string.";
        assertTrue(multiBracketValidation(none));
    }

}