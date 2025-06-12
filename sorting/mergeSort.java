import java.util.Arrays;
class Main {
    public static int[] merge(int[] arr,int low ,int mid ,int high){
        int i=low,j=mid+1,k=0;
        int[] temp = new int[high-low+1];
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        for(int x=0 ; x<temp.length ; x++){
            arr[low+x] = temp[x];
        }
        return arr;
    }
    public static int[] mergeSort(int[] arr,int low ,int high){
        int[] sortedArray = new int[high+1];
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr,low,mid); //left subarray
            mergeSort(arr,mid+1,high); //right subarray
            sortedArray = merge(arr,low,mid,high);
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] arr = {23,45,1,24,89,34,90};
        int[] sortedArr = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(sortedArr));
    }
}
