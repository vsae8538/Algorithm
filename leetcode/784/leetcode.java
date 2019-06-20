import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode {
    public static void main(String[] args) {

    }    
    public List<String> letterCasePermutation(String S) {
        if(S == null){
            return new LinkedList<String>();
        }
        Queue<String> queue = new LinkedList<String>();
        queue.add(S);
        for(int i = 0;i < S.length();i++){
            if(Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for(int j = 0;j < size;j++){
                String s = queue.poll();
                char[] chs = s.toCharArray();
                
                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }
        return new LinkedList<>(queue);
    }
}
