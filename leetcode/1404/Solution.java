import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;


class Solution {


    /**
     * A detailed explanation on the algorithm and an easy-to-understand python version:
        Example: s = 1011000
        The three phases:

        We haven't encountered any 1. Every char adds one operation.
        Example: s = 1011000 -> s = s / 2 -> s = 101100->s = s / 2->s = 10110 -> s = s / 2 -> s = 1011
        Explain: One operation s = s/2 for each 0.

        We encounter our first 1. We set carry to 1 and add two operations.
        Example: s = 1011 -> s = s+1 -> s = 1010 (carry = 1 for the last 1) -> s = s / 2 -> s = 101 (carry = 1)
        Explain: s = s+1, s = s / 2 for the first 1 we encounter. carry = 1 is expected to be added to s = 101 now.

        The rest:
        3A. Every 1 needs one operation (carry makes it 0). carry is still 1 due to addition.
        Example: s = 101 (carry = 1) -> s = s/2 -> s = 10 (carry = 1)
        Explain: carry = 1 is added to s = 101 firstly, and the last bit in s becomes 0. So we perform s = s / 2. Now carry = 1 is expected to be added to s = 10.]
        3B. Every 0 needs two operations (carry makes it 1). carry is still 1 as we need to add 1 in this case.
        Example: s = 10 (carry = 1) -> s = 11 (carry = 0) -> s = s+1 -> s = 10 (carry = 1 for the last 1) -> s = s / 2 (carry = 1)->s = 1 (carry = 1)**Explain:** Step 3B equals to addingcarry = 1to the last bit0` firstly, then performing Step 2.

        The last bit
        4A. After the loop, we have s = 1 (carry = 1) now. We take care of the only bit in s as follows:
        Example: s = 1 (carry = 1) -> s = 10 (carry = 0) -> s = s / 2 -> s = 1 (carry=0)
        Explain: carry = 1 is added to s = 1 firstly, and we have s = 10. Then we perform s = s / 2 to get s = 1
        4B. But what is the case with s = 1 (carry = 0)?
        Explain: We already have the answer, and no extra operation is required in this case.
        4A and 4B can be implemented with res + carry in codes.
     */
    public int numSteps(String s) {
        if(s.length() == 0) return 0;
        int ans = 0;
        int carry = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(i == 0 && carry == 0) break;
            if(s.charAt(i) - '0' != carry){
                carry = 1;
                ans += 1;
            }
            ans += 1;
        }
        return ans;
    }

    /**
     * overflow
     */
//     public int numSteps(String s) {
//         int steps = 0;
//         int num = binaryToNum(s);
//         while(num != 1){
//             if(num % 2 == 1){
//                 num += 1;
//             }else{
//                 num /= 2;
//             }
//             steps++;
//         }
//         return steps;
//     }

//     public int binaryToNum(String s){
//         int res = 0;
//         int n = 1;
//         int i = s.length()-1;
//         while(i >= 0){
//             int num = s.charAt(i) - '0';
//             if(num == 1){
//                 res += n;
//             }
//             n *= 2;
//             i--;
//         }
//         return res;
//     }
}



