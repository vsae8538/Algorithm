package test;

public class test {
	public static void main(String[] args) {
		int x = 4;
		int y = 1;
		System.out.println(hammingDistance(x, y));
	}
    public static int hammingDistance(int x, int y) {
    	int n = x ^ y;
    	String sn = Integer.toBinaryString(n);
    	int sum = 0;
    	for(int i = 0;i < sn.length();i++) {
    		if(sn.charAt(i) == '1')
    			sum++;
    	}
    	return sum;
    }

}
