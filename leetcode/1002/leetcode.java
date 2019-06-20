import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;

class leetcode {
    public static void main(String[] args) {
        String[] s = {"bella","label","roller"};
        String[] a = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
        String[] s2 = {"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"};
        System.out.println(commonChars(s2));
    }
    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<String>();
        int[] counts = new int[26];
        Arrays.fill(counts, Integer.MAX_VALUE);
        for(int i = 0;i < A.length;i++){
            int[] cnt = new int[26];
            for (char c : A[i].toCharArray()) {
                cnt[c - 'a']++;
            }
            for(int j = 0;j < 26;j++){
                counts[j] = Math.min(cnt[j], counts[j]);
            }
        }
        for(int i = 0;i < 26;i++){
            if(counts[i] > 0){
                char c =  (char) (i + 'a');
                for(int j = 0;j < counts[i];j++){
                    result.add("" + c);
                }
            }
        }
        return result;
    }
}
