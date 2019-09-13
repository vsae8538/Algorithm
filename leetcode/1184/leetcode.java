import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int d1 = 0;
        int d2 = 0;
        if(start > destination){
            int n = destination;
            destination = start;
            start = n;
        }
        for(int i = 0;i < distance.length;i++){
            if(i >= start && i < destination){
                d1 += distance[i];
            }else{
                d2 += distance[i];
            }
        }
        return Math.min(d1, d2);
    }
}
