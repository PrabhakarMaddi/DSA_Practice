import java.util.Arrays;
class Main {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n ; i++ ){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       int[] arr = {23,45,1,34,12,56,9};
       int[] sortedArray = insertionSort(arr);
       System.out.println(Arrays.toString(sortedArray));
    }
}

