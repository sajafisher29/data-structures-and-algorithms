package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

        Hashtable testHashTable;
        @Before
        public void setUp() throws Exception {
            testHashTable = new Hashtable<>();
            testHashTable.add("1stKey", "value1");
            testHashTable.add("2ndKey", "value2");
            testHashTable.add("3rdKey", "value3");
            testHashTable.add("4thKey", "value3");
        }

        @Test
        public void testHash() {
            assertEquals("The key Habitat should be ___",
                    testHashTable.hash("Habitat"),
                    3);
        }

        @Test
        public void add() {
            assertEquals("This is the happy test to add.",
                    testHashTable.toString(),
                    "Hashtable{_______}");
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

        @Test(expected = IllegalArgumentException.class)
        public void addDup(){
            testHashTable.add("2ndKey","value2");
        }

}