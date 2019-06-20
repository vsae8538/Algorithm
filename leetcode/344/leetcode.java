import java.util.Arrays;

class leetcode{
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        char[] c2 = {'H','a','n','n','a','h'};

    }
    public void reverseString(char[] s) {
        char tmp;
        for(int i = 0,k = s.length - 1;i < k;i++,k--){
            if(i == k)
                break;
            if(s[i] == s[k])
                continue;
            else{
                tmp = s[i];
                s[i] = s[k];
                s[k] = tmp;
            }
        }
    }
}