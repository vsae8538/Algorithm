import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        //"MDCCCLXXXIV"
    }
    public int romanToInt(String s) {
        Map<Character,Integer> table = new HashMap<>();
        table.put('V', 5);table.put('L', 50);table.put('D', 500);table.put('M', 1000);
        Map<Character,Integer> table2 = new HashMap<>();
        table2.put('I', 1);table2.put('X', 10);table2.put('C', 100);

        char[] chs = s.toCharArray();
        int st = 0,res = 0;
        char tmp = 0;
        for(char c : chs){
            if(st == 1){
                if(tmp == 'I'){
                    if(c == 'V'){
                        res+= 4;
                        break;
                    }
                    else if(c == 'X'){
                        res += 9;
                        break;
                    }
                    else{
                        res += table2.get(tmp);
                    }
                }
                else if(tmp == 'X'){
                    if(c == 'L'){
                        res+= 40;
                        break;
                    }
                    else if(c == 'C'){
                        res += 90;
                        break;
                    }
                    else{
                        res += table2.get(tmp);
                    }
                }
                else if(tmp == 'C'){
                    if(c == 'D'){
                        res+= 400;
                        break;
                    }
                    else if(c == 'M'){
                        res += 900; 
                        break;
                    }
                    else{
                        res += table2.get(tmp);
                    }
                }
                st = 0;
            }else{
                if(table2.containsKey(c)){
                    tmp = c;
                    st = 1;
                }else{
                    res += table.get(c);
                }
            }
        }
        if(st == 1)
            res += table2.get(tmp);
        
        return res;
    }
}