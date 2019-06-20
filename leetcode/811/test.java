package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//2 3 4 5 
public class test {
	public static void main(String[] args) {
    	//String s = "900 google.mail.com";
    	//String s2 = "50 yahoo.com";
		//System.out.println(getCount(s));
		//System.out.println(getDomain(s));
    	
    	String[] s = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
    	ArrayList<String> sa = (ArrayList<String>) subdomainVisits(s);
	 	for (String string : sa) {
			System.out.println(string);
		}
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
    	Map<String, Integer> subDomain = new HashMap<String, Integer>();
    	int  count = 0;
    	StringBuffer domain = new StringBuffer();
    	for (String s : cpdomains) {
			count = getCount(s);
			domain.append(getDomain(s));
			List<String> subDomainList = domainPattern(domain.toString());
			domainMap(subDomainList, count, subDomain);
			domain.setLength(0); //clear current domain 
		}
    	
    	return convertMap(subDomain);
    }
    
    public static List<String> convertMap(Map<String, Integer> map){
    	List<String> result = new ArrayList<String>();
    	Integer count;
    	for(String domain : map.keySet()){
    		count = map.get(domain);
    		result.add(count + " " + domain);
		}
    	return result;
    }
    
    public static void domainMap(List<String> list,int count,Map<String, Integer> resultMap) {
    	for(int i = 0;i < list.size();i++) {
    		if(resultMap.containsKey(list.get(i))) {
    	  		int num = resultMap.get(list.get(i));
    			resultMap.put(list.get(i),num+count);
    		}
    		else {
    			resultMap.put(list.get(i), count);
    		}
    	}
    }
    
    public static List<String> domainPattern(String s) {
    	int i = 0;
    	 List<String> result = new ArrayList<String>();
    	 result.add(s.substring(0, s.length()));
    	 while(i < s.length()){
            if(s.charAt(i) == '.') {
            	result.add(s.substring(i+1, s.length()));
            }
            i++;
        }
    	return result;
    }
    
    public static String getDomain(String s) {
    	int i = 0;
    	String result = new String();
    	while(i < s.length()) {
    		if(s.charAt(i) == ' ') {
    			result = s.substring(i+1,s.length());
    			break;
    		}
    		i++;
    	}
    	return result;
    }
   
    public static Integer getCount(String s) {
    	int i = 0;
    	Integer result = 0;
    	while(i < s.length()) {
    		if(s.charAt(i) == ' ') {
    			result = Integer.valueOf(s.substring(0, i));
    			break;
    		}
    		i++;
    	}
    	return result;
    }
}
