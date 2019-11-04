//package code401challenges.LeftJoin;
//
//import code401challenges.hashtable.Hashtable;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.HashMap;
//import static code401challenges.LeftJoin.LeftJoin.leftJoin;
//import static org.junit.Assert.*;
//
//public class LeftJoinTest {
//
//    HashMap<String, String> map1;
//    HashMap<String, String> map2;
//
//    @Before
//    public void setUp() throws Exception {
//        map1 = new HashMap<>();
//        map2 = new HashMap<>();
//    }
//
//    // Test normal case with mixed shared keys and some null
//    @Test
//    public void testHappyMix() {
//        map1.put("", "");
//        map1.put("", "");
//        map1.put("", "");
//        map1.put("", "");
//        map1.put("", "");
//
//        map2.put("", "");
//        map2.put("", "");
//        map2.put("", "");
//        map2.put("", "");
//        map2.put("", "");
//
//        Hashtable mergedMapsDataTest = leftJoin(map1, map2);
//
//        Hashtable expected = new Hashtable(){
//                {"", "", ""};
//                {"", "", };
//        };
//
//        assertEquals(expected, mergedMapsDataTest);
//    }
//
//    // Test map2 with no shared keys
//    @Test
//    public void testNoMatchInMap2() {
//        map1.put();
//        map1.put();
//        map1.put();
//        map1.put();
//
//        map2.put();
//
//        Hashtable mergedMapsDataTest = leftJoin(map1, map2);
//
//        Hashtable expected = new Hashtable(){
//            {"", "", ""};
//            {"", "", };
//        };
//
//        assertEquals(expected, mergedMapsDataTest);
//    }
//
//    // Test when maps completely align
//    @Test
//    public void testAllMatchingInMap2() {
//
//        map1.put();
//        map1.put();
//        map1.put();
//        map1.put();
//
//        map2.put();
//
//        Hashtable mergedMapsDataTest = leftJoin(map1, map2);
//
//        Hashtable expected = new Hashtable(){
//            {"", "", ""};
//            {"", "", };
//        };
//
//        assertEquals(expected, mergedMapsDataTest);
//    }
//
//    // Test overload on Right(map2)
//    @Test
//    public void testMap2Overload() {
//        map1.put();
//
//        map2.put();
//        map2.put();
//        map2.put();
//        map2.put();
//
//        Hashtable mergedMapsDataTest = leftJoin(map1, map2);
//
//        Hashtable expected = new Hashtable(){
//            {"", "", ""};
//            {"", "", };
//        };
//
//        assertEquals(expected, mergedMapsDataTest);
//    }
//
//    // Test empty maps
//    @Test
//    public void testLeftJoinWhenBothHashMapAreEmpty() {
//        Hashtable mergedMapsDataTest = leftJoin(map1, map2);
//
//        Hashtable expected = new Hashtable(){
//            {"", "", ""};
//            {"", "", };
//        };
//
//        assertEquals(expected, mergedMapsDataTest);
//    }
//
//}