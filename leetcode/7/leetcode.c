int reverse(int x) {
    int max = 0x7fffffff, min = 0x80000000;
    long long result = 0;    
    int flag = 1;
    if(x < 0) flag = -1,x = -x;
    while(x){
        result *= 10;
        result += x % 10;
        if(result > max || result < min){
            result = 0;
            break;
        }
        x /= 10;
    }
    
    
    
    return result * flag;
}
