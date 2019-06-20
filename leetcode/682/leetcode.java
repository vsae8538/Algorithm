import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        String[] s =  {"5","2","C","D","+"};
        String[] s1 = {"5","-2","4","C","D","9","+","+"};
        String[] s3 = {"-60","D","-36","30","13","C","C","-33","53","79"};
        System.out.println(calPoints(s3));
    }
    public static int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<Integer>();
        int p = -1;
        int sum = 0;
        for(int i = 0;i < ops.length;i++){
            if(ops[i].charAt(0) == '-'){
                int num = Integer.valueOf(ops[i]);
                list.add(num);
                sum += num;
                p++;
            }
            if(ops[i].charAt(0) >= '1' && ops[i].charAt(0) <= '9'){
                int num = Integer.valueOf(ops[i]);
                list.add(num);
                sum += num;
                p++;
            }else{
                char ch = ops[i].charAt(0);
                if(ch == 'C'){
                    for(int n = p;n >= 0;n--){
                        if(list.get(n) != 30001){
                            int tmp = list.get(n);
                            sum -= tmp;
                            list.remove(n);
                            tmp = 30001;
                            list.add(n, tmp);
                            break;
                        }
                    }
                }
                if(ch == 'D'){
                    for(int n = p;n >= 0;n--){
                        if(list.get(n) != 30001){
                            int num = list.get(n);
                            sum += (num * 2);
                            list.add(num*2);
                            p++;
                            break;
                        }
                    }
                }
                if(ch == '+'){
                    int cnt = 0;
                    int newNum = 0;
                    for(int n = p;n >= 0;n--){
                        if(list.get(n) != 30001){
                            int num = list.get(n);
                            newNum += num;
                            sum += num;
                            cnt++;
                            if(cnt == 2){
                                list.add(newNum);
                                p++;
                                break;
                            }
                        }
                    }    
                }
            }
            System.out.println(list);
        }
        return sum;
    }
}
