

class leetcode {
    public static void main(String[] args) {

    }
    public boolean divisorGame(int N) {
        int alice = 0;
        int x = 1;
        while(N > 1){
            N -= x;
            alice = 1;
            if(N < 2)
                break;
            N -= x;
            alice = 0;
            if(N < 2)
            break;
        }
        if(alice == 1)
            return true;
        else
            return false;
    }
}
