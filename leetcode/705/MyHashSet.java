import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    Integer[] list;
    /** Initialize your data structure here. */
    public MyHashSet() {
        list = new Integer[1000000];
        Arrays.fill(list,-1);
    }
    
    public void add(int key) {
        if(list[key] == -1)
            list[key] = key;
    }
    
    public void remove(int key) {
        if(list[key] != -1)
            list[key] = -1;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(list[key] != -1)
            return true;
        return false;
    }
}