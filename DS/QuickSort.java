/**
 * QuickSort
 */
public class QuickSort {
    
    public static void quickSort(int A[], int left, int right){
        if(left < right){
            int i = left,j = right;
            int k = A[left];
            while(i < j){
                while(i < j && A[j] >= k) j--;
                A[i] = A[j]; 
                while(i < j && A[i] <= k) i++;
                A[j] = A[i];
            }
            A[i] = k;
            quickSort(A, left, i - 1);
            quickSort(A, i + 1 , right);
        }
    }
    
}

