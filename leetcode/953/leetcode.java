import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode {
    public static void main(String[] args) {
    }

    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            if(compare(words[i], words[i+1], order)>0){
                return false;
            }
        }
        return true;
    }
    public int compare(String s1, String s2, String lang){
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1,len2);
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int i = 0;
        int n1 = 0,n2 = 0;
        while(i < lim){
            n1 = lang.indexOf(ch1[i]);
            n2 = lang.indexOf(ch2[i]);
            if(n1 != n2)
                return n1 - n2;
            i++;
        }
        return len1 - len2;
    }
}
