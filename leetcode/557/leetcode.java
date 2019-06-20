
class leetcode {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String[] sa = s.split(" ");
        StringBuffer res = new StringBuffer();
        for(String st : sa){
            res.append(reverse(st)).append(" ");
        }   
        return res.toString().trim();
    }
    public String reverse(String s){
        StringBuffer res = new StringBuffer();
        char[] chs = s.toCharArray();
        for(int i = s.length() - 1;i >= 0;i--){
            res.append(chs[i]);
        }
        return res.toString();
    }
}
