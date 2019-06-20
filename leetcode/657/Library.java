
package test2;

import java.awt.Desktop.Action;
import java.util.HashMap;
import java.util.Map;

public class Library {

   public static void main(String[] args) {
	   String t1 = "UDUDUDUDUDUDUDLRLRLR";
	   String t2 = "LL";
	   System.out.println(judgeCircle(t1));
	   System.out.println(judgeCircle(t2));
   }

   public static boolean judgeCircle(String moves) {
      int[][] position = {{0,0}};
      int i = 0;
      
	  while(i < moves.length()) {
		  if(moves.charAt(i) == 'U' || moves.charAt(i) == 'u') {
			  position[0][0] += 1;
		  }
		  else if(moves.charAt(i) == 'D' || moves.charAt(i) == 'd') {
			  position[0][0] -= 1;
		  }
		  else if(moves.charAt(i) == 'R' || moves.charAt(i) == 'r') {
			  position[0][1] += 1;
		  }
		  else if(moves.charAt(i) == 'L' || moves.charAt(i) == 'l') {
			  position[0][1] -= 1;
		  }
		  i++;
	  }

	  if(position[0][0] == 0 && position[0][1] == 0) {
		  return true;
	  }else {
		return false;
	  }
   }
}
