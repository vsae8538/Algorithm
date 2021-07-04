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
	public int getMaximumGenerated(int n) {
		int[] nums = new int[n + 1];
		if (n < 2) {
			return n;
		}
		nums[0] = 0;
		nums[1] = 1;
		int max = 1;
		for (int i = 2; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = nums[i / 2];
			} else {
				nums[i] = nums[i / 2] + nums[i / 2 + 1];
			}
			max = Math.max(max, nums[i]);
		}
		return max;
	}
}   


