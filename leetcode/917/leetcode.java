import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < S.length();i++){
            if(!Character.isLetter(S.charAt(i))){
                list.add(i);
            }
        }
        char[] chs = new char[S.length()];
        for(int i:list){
            chs[i] = '-';
        }*/
    }
    public String reverseOnlyLetters(String S) {
        int j = S.length() - 1;
        int i = 0;
        char[] ch = S.toCharArray();
        while(i < j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char tmp = ch[i];
                ch[i] = ch[j];
                ch[j] = tmp;
                i++;
                j--;
            }
            else if(!Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                i++;
                continue;
            }
            else if(Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                j--;
                continue;
            }
            else{
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
}
