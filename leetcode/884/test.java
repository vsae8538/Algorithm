package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		
	}
    public String[] uncommonFromSentences(String A, String B) {
        Set<String> set = new HashSet<String>();
    	List<String> tmplist = new ArrayList<String>();
        String[] s1 = A.split(" ");
        String[] s2 = B.split(" ");
        for(String s: s1) {
        	if(!tmplist.contains(s)) {
        		set.add(s);
        		tmplist.add(s);
        	}else {
        		set.remove(s);
        	}
        }
        for(String s: s2) {
        	if(!tmplist.contains(s)) {
        		set.add(s);
        		tmplist.add(s);
        	}else {
        		set.remove(s);
        	}
        }
        String[] st = new String[set.size()];
        st = set.toArray(st);
    	return st;
    }
}

