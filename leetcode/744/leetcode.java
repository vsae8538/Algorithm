import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }

    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters)
            if((c - 'a') > (target - 'a')) 
                return c;
        return letters[0];
    }
}   
