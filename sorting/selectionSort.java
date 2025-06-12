import java.util.Arrays;
class Main {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++ ){
            int min = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[min])
                  min = j;
            }
            swap(arr,i,min);
        }
        return arr;
    }
    public static void main(String[] args) {
       int[] arr = {23,45,1,34,12,56,9};
       int[] sortedArray = selectionSort(arr);
       System.out.println(Arrays.toString(sortedArray));
    }
}
