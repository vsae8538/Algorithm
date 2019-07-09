import java.util.HashSet;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    } 
    public String defangIPaddr(String address) {
       String res = "";
       for(int i = 0;i < address.length();i++){
           if(address.charAt(i) == '.')
                res += "[.]";
           else
            res += address.charAt(i);
       }
       return res;
    }
}
