import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Solution {


    public String reformatDate(String date) {
        String[] s = date.split(" ");
        String day = ""; 
        for(int i = 0;i < s[0].length();i++){
            if(s[0].charAt(i) >= '0' && s[0].charAt(i) <= '9') day += s[0].charAt(i);
        }
        if(day.length() < 2) 
            day = "0" + day;
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String month = "";
        for(int i = 0;i < months.length;i++){
            if(s[1].equals(months[i])){
                if(i+1 < 10) month = "0"+(i+1);
                else month += (i+1);
            }
        }
        return s[2]+"-"+month+"-"+day;
    }


}



