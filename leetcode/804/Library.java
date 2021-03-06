/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
    	String[] words = {
    			new String("gin"),
    			new String("zen"),
    			new String("gig"),
    			new String("msg")
    	};
    	System.out.println(uniqueMorseRepresentations(words));
    	
	}
   public static int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> charList = new HashMap<Character, String>();
        charList.put('a', ".-");charList.put('f', "..-.");charList.put('k',"-.-" );charList.put('o',"---" );charList.put('s', "..."); charList.put('w',".--" );
        charList.put('b', "-...");charList.put('g',"--." ); charList.put('l',".-.." );charList.put('p', ".--.");charList.put('t', "-"); charList.put('x',"-..-" );
        charList.put('c', "-.-.");charList.put('h',"...." );charList.put('m',"--" );charList.put('q', "--.-");charList.put('u',"..-" );charList.put('y',"-.--" );
        charList.put('d', "-..");charList.put('i', "..");charList.put('n', "-.");charList.put('r',".-." );charList.put('v', "...-");charList.put('z', "--..");
        charList.put('e', ".");charList.put('j',".---" );
        
        Set<String> resultSet = new HashSet<String>();
        StringBuffer stmp = new StringBuffer();
        char[] ctmp;
        for(int i = 0;i<words.length;i++) {
        	ctmp = words[i].toCharArray();
        	for(int j = 0;j < ctmp.length;j++) {
        		stmp.append(charList.get(ctmp[j]));
        	}
        	resultSet.add(stmp.toString());
          	stmp.setLength(0);

        }
        return resultSet.size();
    }
}
