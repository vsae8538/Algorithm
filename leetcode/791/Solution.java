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



    public String customSortString(String S, String T) {

        int[] count = new int[26];
        for (char c: T.toCharArray())
            count[c - 'a']++;
        StringBuilder ans = new StringBuilder();

        for (char c: S.toCharArray()) {
            for (int i = 0; i < count[c - 'a']; ++i)
                ans.append(c);
            count[c - 'a'] = 0;
        }


        for (char c = 'a'; c <= 'z'; ++c)
            for (int i = 0; i < count[c - 'a']; ++i)
                ans.append(c);

        return ans.toString();
    }


    /**
     * 正確答案,但測試資料和描述有錯誤
     * S = "kqep"
        T = "kqepe"
        Output: "kqepe"
        Expected: "kqeep"
     */

    // public String customSortString(String S, String T) {
    //     int[] arr = new int[26];
    //     Arrays.fill(arr, 0);
    //     for(int i = 0;i < T.length();i++){
    //         arr[T.charAt(i) - 'a']++;
    //     }

    //     int j = 0;
    //     int k = 0;
    //     StringBuffer sb = new StringBuffer(T);
    //     for(int i = 0;i < T.length();i++){
    //         if(j < S.length() && arr[S.charAt(j) - 'a'] > 0){
    //             sb.setCharAt(i, S.charAt(j));
    //             arr[S.charAt(j) - 'a']--;
    //             k++;
    //         }
    //         if(j < S.length() &&  arr[S.charAt(j) - 'a'] == 0) j++;
    //     }

    //     for(int i = 0;i < 26;i++){
    //         if(arr[i] != 0){
    //             char c = (char)(i + 'a');
    //             sb.setCharAt(k, c);
    //             k++;
    //         }
    //     }

    //     return sb.toString();
    // }
}
