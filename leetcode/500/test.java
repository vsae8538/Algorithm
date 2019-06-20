package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
	//QWERTYUIOP 17,23,05,18,20,25,21,09,15,16
	//ASDFGHJKL  01,19,04,06,07,08,10,11,12
	//ZXCVBNM  26,24,03,22,02,13,14	
	public static int[][] rows = {
			{0,0,0,0,1,
			 0,0,0,1,0,
			 0,0,0,0,1,
			 1,1,1,0,1,
			 1,0,1,0,1,
			 0
			},
			{1,0,0,1,0,
			 1,1,1,0,1,
			 1,1,0,0,0,
			 0,0,0,1,0,
			 0,0,0,0,0,
			 0
			},
			{0,1,1,0,0,
			 0,0,0,0,0,
			 0,0,1,1,0,
			 0,0,0,0,0,
			 0,1,0,1,0,
			 1
			}
	};

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        int flag = 0;
        for(int i = 0;i < words.length;i++) {
        	for(int k = 0;k < 3;k++) {
        		for(int j = 0;j < words[i].length();j++) {
        			if(words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z') {
            			if(rows[k][words[i].charAt(j) - 'a'] == 0){
            				flag = 1;
            				break;
            			}
        			}else{
        				if(rows[k][words[i].charAt(j) - 'A'] == 0) {
        					flag = 1;
            				break;
            			}
        			}
        		}
        		if(flag == 0) {
        			list.add(words[i]);
        		}
        		flag = 0;
        	}
        	
        }
        String[] s = new String[list.size()];
        s = list.toArray(s);
        return s;
    }
	public static void main(String[] args) {
		String[]  s = {"Hello", "Alaska", "Dad", "Peace"};
		String[] result = findWords(s);
		for (String string : result) {
			System.out.println(string);
		}
	}
}

