package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableTest {

        Hashtable testHashTable;
        @Before
        public void setUp() throws Exception {
            testHashTable = new Hashtable();
            testHashTable.add("1stKey", "value1");
            testHashTable.add("2ndKey", "value2");
            testHashTable.add("3rdKey", "value3");
            testHashTable.add("4thKey", "value3");
        }

        @Test
        public void hash() {
            //ASCII value for "Key" is 297
            int hashIndex = testHashTable.hash("Key");
            int expectedHashIndex = (297*599) % 5;
            assertEquals(expectedHashIndex, hashIndex);
            assertTrue(hashIndex < 6 && hashIndex >= 0);
        }

        @Test
        public void add() {
            assertTrue(testHashTable.add("8thKey", "value8"));
        }

        @Test
        public void get() {
            assertEquals("The third key returns value3.",
                    testHashTable.get("3rdKey"),
                    "value3");
        }

        @Test
        public void contains() {
            assertTrue(testHashTable.contains("2ndKey"));
        }

        @Test
        public void addDup(){
            assertFalse( testHashTable.add("2ndKey","value2"));
        }

}