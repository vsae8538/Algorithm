import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Arrays.sort(deck);
        for(int i = deck.length - 1;i >= 0;i--){
            queue.add(deck[i]);
            if(i == 0) break;
            queue.add(queue.poll());
        }
        for(int i = deck.length - 1;i >= 0;i--){
            deck[i] = queue.poll();
        }
        return deck;
    }
}