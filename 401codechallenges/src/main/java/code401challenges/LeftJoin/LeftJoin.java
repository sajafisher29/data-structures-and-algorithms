package code401challenges.LeftJoin;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class LeftJoin {

//    public static Hashtable leftJoin (Hashtable<String, String> map1, Hashtable<String, String>  map2){
//        Hashtable mergedMapsData;
//
//        for(HashMap.Entry<String, String> data: map1.entrySet()){
//            String currentKey = data.getKey();
//
//            if (map2.containsKey(currentKey)) {
//                mergedMapsData.add(currentKey)
//            }
//            for(HashNode data : map1[i]) {
//                mergedMapsData[i].add(data.getKey());
//                mergedMapsData[i].add(data.getValue());
//                mergedMapsData[i].add(map2.get(data.getKey()));
//            }
//        }
//        return mergedMapsData;
//    }

    // Code Review in class:
    public static ArrayList<String[]> leftJoin (Hashtable<String, String> map1, Hashtable<String, String>  map2){
        ArrayList<String[]> mergedMapsData = new ArrayList<>();

        for (LinkedList<HashNode<String, String>> bucket : map1.hashtable) {
            if (bucket != null) {
                for (HashNode<String, String> node : bucket) {
                    mergedMapsData.add(new String[]{node.getKey(), node.getValue(), map2.contains(node.getKey()) ? map2.get(node.getKey()) : null});
                }
            }
        }
        return mergedMapsData;
    }
}
