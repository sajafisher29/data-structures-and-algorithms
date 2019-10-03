import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    // I need all the tests!

    @Test public void testCorrectOutcomeTrue() {
        String good = "(I am a {@ood} string.)";
        assertTrue( );
    }

    @Test public void testCorrectOutcomeFalse() {
        String good = "(I a/m a ba} string.)";
        assertFalse( );
    }

    @Test public void testStringWithoutBrackets() {
        String good = "I am a @ood string.";
        assertTrue( );
    }

}