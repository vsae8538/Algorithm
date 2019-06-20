package test;

public class test {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(isPalindrome(i));
		
	}
	  public static boolean isPalindrome(int x) {
		if(x == 0) {
			return true;
		}
		else if(x < 0) {
			return false;
		}else if(x < 10) {
			return true;
		}else {
			String s1 = Integer.toString(x);
		    String s2 = new StringBuffer(s1).reverse().toString();
		    if(s1.equals(s2))
		        return true;
		    else
		        return false;
		   }	
		}
}
