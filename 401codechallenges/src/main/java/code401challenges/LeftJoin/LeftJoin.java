package code401challenges.LeftJoin;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import java.util.HashMap;

public class LeftJoin {

    public static Hashtable mushLeftIntoRight (HashMap<String, String> map1, HashMap<String, String>  map2){
        Hashtable mergedMapsData;

        for(HashMap.Entry<String, String> data: map1.entrySet()){
            String currentKey = data.getKey();

            if (map2.containsKey(currentKey)) {
                mergedMapsData.add(currentKey)
            }
            for(HashNode data : map1[i]) {
                mergedMapsData[i].add(data.getKey());
                mergedMapsData[i].add(data.getValue());
                mergedMapsData[i].add(map2.get(data.getKey()));
            }
        }
        return mergedMapsData;
    }
}
