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

    /**
     * 
     * 迭代
     * 
     */

    class Trie {
        Trie[] sub = new Trie[26];
        LinkedList<String> suggestion = new LinkedList<>();
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie root = new Trie();
        Arrays.sort(products);
        for (String p : products) { // build Trie.
            Trie t = root;
            for (char c : p.toCharArray()) { // insert current product into Trie.
                if (t.sub[c - 'a'] == null)
                    t.sub[c - 'a'] = new Trie();
                t = t.sub[c - 'a'];
                if (t.suggestion.size() < 3) // maintain 3 lexicographically minimum strings.
                    t.suggestion.offer(p); // put products with same prefix into suggestion list.                
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (char c : searchWord.toCharArray()) { // search product.
            if (root != null) // if current Trie is NOT null.
                root = root.sub[c - 'a'];
            ans.add(root == null ? Arrays.asList() : root.suggestion); // add it if there exist products with current prefix.
        }
        return ans;
    }  




    // public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    //     Trie root = new Trie();
    //     Arrays.sort(products);   
    //     for (String p : products) { // build Trie.
    //         insert(p, root); // insert a product into Trie.
    //     }
    //     return search(searchWord, root);
    // }

    // private void insert(String p, Trie root) {
    //     Trie t = root;
    //     for (char c : p.toCharArray()) { // insert current product into Trie.
    //         if (t.sub[c - 'a'] == null)
    //             t.sub[c - 'a'] = new Trie();
    //         t = t.sub[c - 'a'];
    //         if (t.suggestion.size() < 3) // maintain 3 lexicographically minimum strings.
    //             t.suggestion.offer(p); // put products with same prefix into suggestion list.
    //     }
    // }
    // private List<List<String>> search(String searchWord, Trie root) {
    //     List<List<String>> ans = new ArrayList<>();
    //     for (char c : searchWord.toCharArray()) { // search product.
    //         if (root != null) // if there exist products with current prefix.
    //             root = root.sub[c - 'a'];
    //         ans.add(root == null ? Arrays.asList() : root.suggestion); // add it if there exist products with current prefix.
    //     }
    //     return ans;
    // }
}
