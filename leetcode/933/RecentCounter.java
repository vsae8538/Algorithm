package test;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
	//设置一个记录历史值属性，每次ping都把t存进历史里，然后数历史中有多少个值在【t-3000, t 】范围内	
	private Queue<Integer> timeQueue;
	
    public RecentCounter() {
        timeQueue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        timeQueue.offer(t);
        while(!timeQueue.isEmpty() && timeQueue.peek() < t - 3000) {
        	timeQueue.poll();
        }
        return timeQueue.size();
    }
}
