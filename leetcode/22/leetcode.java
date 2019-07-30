import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class leetcode {
    public static void main(String[] args) {
        /*Calendar calendar = Calendar.getInstance();
        
		Date today = new Date();
		calendar.setTime(today);
		calendar.add(Calendar.MINUTE, -test);
        Date startTime = calendar.getTime();
        startTime.setSeconds(0);*/
        Integer test = 60;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date today = new Date();
        today.setMinutes(today.getMinutes() - test);
        today.setSeconds(0);
        System.out.println(today);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateAll(new char[n * 2], 0, res);
        return res;
    }

    public void generateAll(char[] current, int pos, List<String> res){
        if(pos == current.length){
            if(vaild(current))
                res.add(new String(current));
        }else{
            current[pos] = '(';
            generateAll(current, pos+1, res);
            current[pos] = ')';
            generateAll(current, pos+1, res);
        }
    }

    public boolean vaild(char[] cur){
        int bal = 0;
        for(char c : cur){
            if(c == '(') 
                bal++;
            else
                bal--;
            if(bal < 0)
                return false;
        }
        return (bal == 0);
    }
}

