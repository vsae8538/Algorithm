import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    List<Integer> list;
    /** Initialize your data structure here. */
    public MyHashSet() {
        list = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        for(int i : list){
            if(i == key)
                return;
        }
        list.add(key);
    }
    
    public void remove(int key) {
        for(int i = 0;i < list.size();i++){
            if(list.get(i) == key)
                list.remove(i);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i : list){
            if(i == key)
                return true;
        }
        return false;
    }
}