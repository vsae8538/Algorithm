/**
 * QuickSort
 */
public class QuickSort {
 
    
    public void quickSort(int a[], int left, int right){
        if(left <= right){
            int mid = partiton(a, left, right);
            quickSort(a, mid + 1, right);
            quickSort(a, left, mid - 1);
        }
    }
    
    public int partiton(int[] a, int left, int right){
        int i = left + 1, j = right, pivot = a[left];
        while(i <= j){
            while(i <= j && a[i] <= pivot) i++;
            while(i <= j && a[j] > pivot) j--;
            if(i < j){
                swap(a, i, j);
            }
        }
        
        swap(a, left, j);

        return j;
    }

    public void swap(int a[], int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}

