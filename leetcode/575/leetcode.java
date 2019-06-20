import java.util.HashSet;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {

    }
    public int distributeCandies(int[] candies) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i : candies) {
            result.add(i);
        }
        return Math.min(candies.length/2, result.size());
    }
}
