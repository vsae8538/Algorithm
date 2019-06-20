import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class leetcode {
    public static void main(String[] args) {

    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<String>();
        for(String s:words){
            Map<Character,Character> maps = new HashMap<Character,Character>();
            char[] pat = pattern.toCharArray();
            char[] chs = s.toCharArray();
            for(int i = 0;i < pattern.length();i++){
                if(!maps.containsValue(chs[i])){
                    maps.put(pat[i],chs[i]);
                }
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < pattern.length();i++){
                if(maps.containsKey(pat[i]))
                    sb.append(maps.get(pat[i]));
                else
                    break;    
            }
            if(sb.toString().equals(s))
                res.add(s);
        }
        return res;
    }
}
