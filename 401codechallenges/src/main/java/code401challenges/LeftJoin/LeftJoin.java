package code401challenges.LeftJoin;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class LeftJoin {

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
