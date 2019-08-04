import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class problem {
    public static void main(String[] args) {
        int[] stones = {1,2,3,4,5};
        List<Integer> list = new ArrayList<Integer>();
        for(int i : stones) list.add(i);
        list.
        System.out.println(list);
    }
    //此題可使用優先權佇列(隊列)
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new LinkedList<>();
        for(int i : stones) list.add(i);
        while(list.size() > 1){
            int y = Collections.max(list);
            for(int i = 0;i < list.size();i++){
                if(list.get(i) == y){
                    list.remove(i);
                    break;
                }
            }
            int x = Collections.max(list);
            for(int i = 0;i < list.size();i++){
                if(list.get(i) == x){
                    list.remove(i);
                    break;
                }
            }
            if(x == y) continue;
            if(x != y) list.add(y - x);
        }
        if(list.size() == 0) 
            return 0;
        else 
            return list.get(0);
    }
}