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


class PeekingIterator implements Iterator<Integer> {

    int current;
    int prev;
    List<Integer> list;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        current = 0;
        prev = -1;
        list = new ArrayList<>();

        while(iterator.hasNext()){
            list.add(iterator.next());
        }

    }
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(current);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next(){
        prev++;
        current = prev + 1;
        int n = list.get(prev);
        return n;
	}

    	
	@Override
	public boolean hasNext() {
        return prev != list.size();
	}

}