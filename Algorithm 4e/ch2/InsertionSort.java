
/**
 * 此排序對於已排序的陣列或是部分排序的陣列擁有較佳的性能
 */
class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,8,5};
        InsertionSort(arr);
        for(int n : arr)
            System.out.print(n + " ");
    }

    public static void InsertionSort(int[] arr){
        int N = arr.length;
        for(int i = 0;i < N;i++){
            for(int j = i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    //exch(j,j-1)
                    int T = arr[j]; arr[j] = arr[j-1]; arr[j-1] = T;
                }
            }
        }
    }
}