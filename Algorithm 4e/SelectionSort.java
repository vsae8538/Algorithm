/***
 * 選擇排序法 
 */
class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6,4,7,8};
        sort(arr);
        for(int i : arr) System.out.print(i + " ");
    }

    public static void sort(int[] a){
        for(int i = 0;i < a.length - 1;i++){
            int min = i;
            for(int j = i + 1;j < a.length;j++){
                if(a[min] > a[j]) min = j;
            }
            exch(a, i, min);
        }
    }

    public static void exch(int[]a,int i,int j){
        int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
    }
}