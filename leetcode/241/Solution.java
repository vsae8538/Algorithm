import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Random;

class Solution{

    /**
     * 分治 + 記憶化搜索
     */
    HashMap<String,List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String input) {
        if (input.length() == 0) {
            return new ArrayList<>();
        }

        if(map.containsKey(input)){
            return map.get(input);
        }

        List<Integer> result = new ArrayList<>();
        int num = 0;
        int index = 0;
        while(index < input.length() && !isOperation(input.charAt(index))){
            num = num * 10 + input.charAt(index) - '0';
            index++;
        }

        if(index == input.length()){
            result.add(num);
            map.put(input, result);
            return result;
        }

        for(int i = 0;i < input.length();i++){
            if(isOperation(input.charAt(i))){
                List<Integer> result1 = diffWaysToCompute(input.substring(0, i));
                List<Integer> result2 = diffWaysToCompute(input.substring(i + 1));
            
                for (int j = 0; j < result1.size(); j++) {
                    for (int k = 0; k < result2.size(); k++) {
                        char op = input.charAt(i);
                        result.add(caculate(result1.get(j), op, result2.get(k)));
                    }
                }
            }
        }
        map.put(input, result);
        return result;
    }

    /**
     * 分治
     * @param input
     * @return
     */
    public List<Integer> diffWaysToCompute(String input) {
        if (input.length() == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int num = 0;
        int index = 0;
        while(index < input.length() && !isOperation(input.charAt(index))){
            num = num * 10 + input.charAt(index) - '0';
            index++;
        }

        if(index == input.length()){
            result.add(num);
            return result;
        }

        for(int i = 0;i < input.length();i++){
            if(isOperation(input.charAt(i))){
                List<Integer> result1 = diffWaysToCompute(input.substring(0, i));
                List<Integer> result2 = diffWaysToCompute(input.substring(i + 1));
            
                for (int j = 0; j < result1.size(); j++) {
                    for (int k = 0; k < result2.size(); k++) {
                        char op = input.charAt(i);
                        result.add(caculate(result1.get(j), op, result2.get(k)));
                    }
                }
            }
        }

        return result;
    }
    
    private int caculate(int num1, char c, int num2) {
        switch (c) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
        }
        return -1;
    }
    
    private boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '*';
    }
    

}   


