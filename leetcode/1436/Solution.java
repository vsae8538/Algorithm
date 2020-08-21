import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Solution {



    public String destCity(List<List<String>> paths) {
        Map<String, String> map = prepare(paths);
        String from = paths.get(0).get(0);
        while(true){
            if(!map.containsKey(from))
                return from;
            from = map.get(from);
        }
    }

    private Map<String, String> prepare(List<List<String>> paths){
        Map<String, String> map = new HashMap<>();
        for(List<String> path : paths)
            map.put(path.get(0), path.get(1));
        return map;
    }


    // public String destCity(List<List<String>> paths) {
    //     if(paths == null) return null;
    //     String res = paths.get(0).get(paths.get(0).size()-1);
    //     for(int i = 0;i < paths.size();i++){
    //         List<String> prev = paths.get(i);
    //         String city = prev.get(prev.size()-1);
    //         int st = 0;
    //         for(int j = 0;j < paths.size();j++){
    //             List<String> curr = paths.get(j);
    //             String from = curr.get(0);
    //             if(city.equals(from)){
    //                 st = 1;
    //                 break;
    //             }
    //         }
    //         if(st == 0) res = city;
    //     }

    //     return res;
    // }
}
