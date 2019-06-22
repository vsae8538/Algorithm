import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        String Str = new String("Welcome to gitbook.net");

        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Welcome") );
  
        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Tutorials") );
  
        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Yiibai", 11) );

    }
    //原理使用輾轉相除法
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length())
            return gcdOfStrings(str2, str1);
        if(str2.length() == 0)
            return str1;
        if(str1.startsWith(str2)){
            while(str1.startsWith(str2)){
                str1 = str1.substring(str2.length());
            }
            return gcdOfStrings(str2, str1);
        }else 
            return "";
    }
}