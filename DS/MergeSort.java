public class MergeSort {
    
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }  

    private static void sort(Comparable[] a, int low, int high){
        if(high >= low) 
            return;
        
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid+1, high);
        merge(a, low, high, mid);
    }

    private static void merge(Comparable[] a, int low, int high, int mid){
        int i = low, j = mid + 1;

        for(int k = low;k <= high;k++)
            aux[k] = a[k];

        for(int k = low;k <= high;k++){
            if(i > mid) a[k] = aux[j++]; //左半邊結束
            else if(j > high) a[k] = aux[i++]; //右半邊結束
            else if(less(aux[j], aux[i])) 
                a[k] = aux[j++];
            else 
                a[k] = aux[i++];  
        }
    }

    private static boolean less(int i, int j){
        return aux[i].compareTo(aux[j]) < 0;
    }
}
