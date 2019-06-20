

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");
      
    } 
    //O(1)
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        return num % 9== 0 ? 9 : num % 9;
    }
}
