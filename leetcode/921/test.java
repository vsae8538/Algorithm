package test;

import java.rmi.server.Skeleton;
import java.util.HashSet;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		String SS = "))()";
		System.out.println(minAddToMakeValid(SS));
	}
    public static int minAddToMakeValid(String S) {
    	 int n = S.length();
         int total = 0;
         int balnc = 0;
         
         for(int i=0;i<n;i++){
             char now = S.charAt(i);
             
             if(now=='('){
                 balnc++;
             }else{
                 if(balnc==0){
                     total++;
                     continue;
                 }else{
                     balnc--;
                 }
             }
             
         }
         
         total += balnc;
         
         return total;
         
    }
}

//O(n)		
