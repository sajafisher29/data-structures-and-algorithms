package code401challenges.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

public class HashNodeTest {

    @Test
    public void testHashNodeExists() {
        HashNode exists = new HashNode();

        assertTrue(
                "The class HashNode exists.",
                true
        );
    }
}