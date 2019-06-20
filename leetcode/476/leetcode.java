

class leetcode {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(toBinary(num).toString());
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        StringBuffer bString = new StringBuffer(toBinary(num));
        char[] comp = new char[bString.length()];
        for(int i = 0;i < bString.length();i++){
            if(bString.charAt(i) == '1'){
                comp[i] = '0'; 
            }
            else{
                comp[i] = '1'; 
            }
        }
        int sum = 0;
        int n = 1;
        for(int i = 0;i < comp.length;i++){
            if(comp[i] == '1'){
                sum += n;
            }
            n *= 2;
        }
        return sum;
    }
    public static String toBinary(int num){
        StringBuffer result = new StringBuffer();
        int n;
        while(num > 0){
            n = num % 2;
            result.append(String.valueOf(n));
            num /= 2;
        }
        return result.toString();
    }
}
