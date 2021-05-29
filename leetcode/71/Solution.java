import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;


class Solution{

    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        if(path == null || path.length() == 0 || path.charAt(0) != '/')
            return sb.toString();

        String[] splits = path.split("/");
        List<String> dirs = new ArrayList<>();
        for(String split : splits){
            if(split.equals(".") || split.isEmpty()) continue;
            if(split.equals("..") && dirs.isEmpty()) continue;

            if(split.equals("..")){
                dirs.remove(dirs.size() - 1);
            }else{
                dirs.add(split);
            }
        }

        sb.append("/");
        for(String dir : dirs){
            sb.append(dir + "/");
        }

        if(sb.length() > 1){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }


    

}

