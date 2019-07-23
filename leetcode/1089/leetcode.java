import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    }
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList();
        for(int i : arr){
            if(i == 0) 
                queue.add(0);
            queue.add(i);
            if(queue.size() == arr.length) 
                break;
        }
        for(int i = 0;i < arr.length; i++)
            arr[i] = queue.poll();
        return;
    }
}   
