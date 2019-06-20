package test;

public class test {
	public static void main(String[] args) {
		String ss = "IDID";
		String ss2 = "III";
		String ss3 = "DDI";
		int result[] = diStringMatch(ss3);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
	public static int[] diStringMatch(String S) {
      int[] result = new int[S.length()+1];
      int i = 0;
      int max = S.length();
      int min = 0;
      char[] ch = S.toCharArray();
      while(i < S.length()) {
    	  if(ch[i] == 'I' || ch[i] == 'i') {
    		  result[i] = min;
    		  min++;
    	  }
    	  else if(ch[i] == 'D' || ch[i] == 'd') {
    		  result[i] = max;
    		  max--;
    	  }
    	  i++;
      }
      result[i] = max;
      return result;
    }
}
