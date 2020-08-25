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

 
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String father = ans.get(ans.size() - 1);
            if (folder[i].indexOf(father + "/") == -1) {
                ans.add(folder[i]);
            }
        }

        return ans;
    }

}



