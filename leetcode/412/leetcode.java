import java.util.ArrayList;
import java.util.List;


class leetcode {
    public static void main(String[] args) {

    }
    public List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<String>();
        for(int i = 1;i <= n;i++){
            if(i % 3 == 0 && i % 5 != 0){
                result.add(new String("Fizz"));
            }
            else if(i % 5 == 0 && i % 3 != 0){
                result.add(new String("Buzz"));
            }
            else if(i % 5 == 0 && i % 3 == 0){
                result.add(new String("FizzBuzz"));
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
