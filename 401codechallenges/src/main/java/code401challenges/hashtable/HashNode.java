package code401challenges.hashtable;

public class HashNode {

    private String key;
    private String value;

    //Constructor
    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public HashNode() {};

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashNode{ key = " + key + ", value = " + value + "}";
    }
}
