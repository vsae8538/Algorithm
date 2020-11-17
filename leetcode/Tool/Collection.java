public class Collection {

    public void tool(){
        //Heap Desc 
        // PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
        //     public int compare(int m, int n) {
        //         return n - m;
        //     }
        // });

        //Heap ASC
        //PriorityQueue<String> heap = new PriorityQueue<>((a,b) -> (map.get(b) - map.get(a)));

        //Heap DESC
        //PriorityQueue<String> heap = new PriorityQueue<>((a,b) -> (map.get(a) - map.get(b)));

        //Heap Desc 2
        // PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        //Heap 多重比較
        // PriorityQueue<String> heap = new PriorityQueue<String>(
        //     (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
        //     w2.compareTo(w1) : count.get(w1) - count.get(w2) );
        
        //list -> array
        // list.stream().mapToInt(i->i).toArray();

        //TreeSet
        //SortedSet<Integer> set = new TreeSet<>();

        //TreeMap Desc 只能對鍵排序
        //Map<Character,Integer> treeMap = new TreeMap<>(Collections.reverseOrder());map

        // foreach map
        // for(String s : map1.keySet()){

        //list to array (String)
        //String[] array = list.toArray(new String[0]);
        
        //String排序
        // Collections.sort(d, new Comparator < String > () {
        //     public int compare(String s1, String s2) {
        //         return s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2);
        //     }
        // });
        
        //2d 陣列排序
        //Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    }


}
