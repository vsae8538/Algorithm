

public class HeapSort{
    
    public void sort(Comparable[] a){
        int N = a.length;
        for(int k = N/2;k >= 1;k--){
            sink(a, k, N);
        }
        while(N-- > 1){
            exch(a, 1, N);
            sink(a, 1, N);
        }
    }

    private void swim(Comparable[] a, int k, int N){
        while(k > 1 && less(a, k/2, k)){
            exch(a, k/2, k);
            k = k /2;
        }
    }

    private void sink(Comparable[] a, int k, int N){
        while(2 * k <= N){
            int j = 2 * k;
            if(j < N && less(a, j, j+1)) j++;
            if(!less(a, k, j)) break;
            exch(a, k, j);
            k = j;
        }
    }

    private boolean less(Comparable[] a, int i, int j){
        return a[i].compareTo(a[j]) < 0;
    }

    private void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
}