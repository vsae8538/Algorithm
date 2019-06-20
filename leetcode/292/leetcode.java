class leetcode{
    public static void main(String[] args) {
        
    }
    /**
     * 巴什博弈 n%(m+1) != 0 ,先手總是會贏
     * @param n
     * @return
     */
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}