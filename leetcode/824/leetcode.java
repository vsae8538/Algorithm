
class leetcode {
    public static void main(String[] args) {
        
    }    
    public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        StringBuffer res = new StringBuffer();
        for(int i = 0;i < str.length;i++){
            char[] ch = str[i].toCharArray();
            if(ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u'
                || ch[0] == 'A' || ch[0] == 'E' || ch[0] == 'I' || ch[0] == 'O' || ch[0] == 'U'){
                res.append(str[i]).append("ma");
            }else{
                for(int j = 1;j < ch.length;j++){
                    res.append(ch[j]);
                }
                res.append(ch[0]).append("ma");
            }
            for(int k = 0;k < i + 1;k++){
                res.append("a");
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
